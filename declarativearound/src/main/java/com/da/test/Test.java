package com.da.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.da.beans.Calculator;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Calculator calculator = context.getBean("calculator", Calculator.class);
		calculator.add(10, 20);
		calculator.add(10, 20);
	}
}
