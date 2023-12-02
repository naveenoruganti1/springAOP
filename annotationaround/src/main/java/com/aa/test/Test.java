package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aa.beans.Calculator;
import com.aa.beans.JavaConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		Calculator calculator = applicationContext.getBean("calculator",Calculator.class);
		calculator.add(10, 20);
	}

}
