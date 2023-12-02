package com.aadv.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.aadv.exception.WeakKeyException;

public class KeyAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("In advice: "+returnValue.toString());
		if(Integer.parseInt(returnValue.toString())<=50) {
			throw new WeakKeyException("Weak key...");
		}
	}
}
