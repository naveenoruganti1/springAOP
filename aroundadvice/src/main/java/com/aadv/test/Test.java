package com.aadv.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aadv.beans.CacheAdvice;
import com.aadv.beans.Calculator;
import com.aadv.beans.LoggingAdvice;
import com.aadv.beans.LoggingStaticPointCutAdvice;

public class Test {
	public static void main(String[] args) {
		int sum =0;
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Calculator());
		//factory.addAdvice(new LoggingAdvice());
		//factory.addAdvice(new CacheAdvice());
		DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(new LoggingStaticPointCutAdvice(),
				new LoggingAdvice());
		factory.addAdvisor(advisor);
		
		Calculator proxy = (Calculator) factory.getProxy();
		sum = proxy.add(10, 20);
		
		sum = proxy.substract(20, 20);
		
		sum = proxy.multiply(10, 30);
	}
}
