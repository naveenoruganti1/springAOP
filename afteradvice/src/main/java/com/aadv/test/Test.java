package com.aadv.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aadv.beans.KeyAdvice;
import com.aadv.beans.KeyGenerator;

public class Test {

	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new KeyGenerator());
		factory.addAdvice(new KeyAdvice());
		
		KeyGenerator generator = (KeyGenerator) factory.getProxy();
		int ret = generator.keyGenerator(280);
		System.out.println("Return in main: "+ret);
	}

}
