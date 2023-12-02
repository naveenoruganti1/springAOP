package com.aadv.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class LoggingStaticPointCutAdvice extends StaticMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		if(null!=targetClass && (method.getName().equals("add") 
				|| method.getName().equals("substract"))) {
			return true;
		}
		return false;
	}
}
