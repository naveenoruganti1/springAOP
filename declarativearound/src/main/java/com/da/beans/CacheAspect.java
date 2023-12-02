package com.da.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAspect {
	private Cache cache;
	
	public void setCache(Cache cache) {
		this.cache = cache;
	}
	public Object applyCache(ProceedingJoinPoint pjp) throws Throwable {
		Object ret = null;
		Object[] args = null;
		String methodName = null;
		
		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();

		String key = methodName+"(";
		for(int i=0; i<args.length; i++) {
			if(i==0) {
				key+=args[i];
				continue;
			}
			key+=","+args[i];
		}
		key+=")";
		if(cache.containsKey(key)) {
			ret = cache.get(key);
			System.out.println("From Cache...."+ret);
		}else {
			ret = pjp.proceed();
			cache.put(key, ret);
		}
		return ret;
	}
}
