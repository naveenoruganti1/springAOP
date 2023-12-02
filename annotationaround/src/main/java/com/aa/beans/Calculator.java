package com.aa.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int add(int a, int b) {
		int sum = 0;
		sum = a+b;
		return sum;
	}
}
