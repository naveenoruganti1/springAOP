package com.tadv.test;

import org.springframework.aop.framework.ProxyFactory;

import com.tadv.beans.GlobalThrowerAdvice;
import com.tadv.beans.Thrower;

public class Test {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Thrower());
		proxyFactory.addAdvice(new GlobalThrowerAdvice());
		
		Thrower thrower = (Thrower) proxyFactory.getProxy();
		int ret = thrower.validate(-10);
		System.out.println("Return value: "+ret);
	}

}
