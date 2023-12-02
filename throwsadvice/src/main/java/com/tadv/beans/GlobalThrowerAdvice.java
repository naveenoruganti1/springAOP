package com.tadv.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class GlobalThrowerAdvice implements ThrowsAdvice{
	public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
		System.out.print("method : "+method.getName()+"(");
		for(int i=0; i<args.length;i++) {
			if(i==0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print(","+args[i]);
		}
		System.out.println(") has reported with exception with message : "+e.getMessage());
	}
}
