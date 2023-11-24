package com.aadv.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Object ret = null;
		String key = null;
		Cache cache = null;
		
		cache = Cache.getInstance();
		methodName = invocation.getMethod().getName();
		args = invocation.getArguments();
		key = methodName+"(";
		for(int i=0; i<args.length; i++) {
			if(i==0) {
				key +=args[i];
				continue;
			}
			key+=","+args[i];
		}
		key+=")";
		
		if(cache.containsKey(key)) {
			System.out.println("From Cache : "+key);
			return cache.get(key);
		}
		ret = invocation.proceed();
		System.out.println("From method execution : "+key);
		cache.put(key, ret);
		return ret;
	}
}
