package com.aadv.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aadv.beans.CacheAdvice;
import com.aadv.beans.Calculator;
import com.aadv.beans.LoggingAdvice;

public class Test {
	public static void main(String[] args) {
		int sum =0;
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Calculator());
		//factory.addAdvice(new LoggingAdvice());
		factory.addAdvice(new CacheAdvice());
		
		Calculator proxy = (Calculator) factory.getProxy();
		sum = proxy.add(10, 20);
		System.out.println("Sum : "+sum);
		
		sum = proxy.add(10, 20);
		System.out.println("Sum : "+sum);
		
		sum = proxy.add(10, 30);
		System.out.println("Sum : "+sum);
	}
}
