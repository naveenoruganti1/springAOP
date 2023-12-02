package com.aadv.beans;

public class Calculator {
	public int add(int a, int b) {
		System.out.println("In add");
		int sum = 0;
		sum = a+b;
		return sum;
	}
	public int substract(int a, int b) {
		System.out.println("In substract");
		int val = 0;
		val = a-b;
		return val;
	}
	public int multiply(int a, int b) {
		System.out.println("In multiply");
		int multVal = 0;
		multVal = a*b;
		return multVal;
	}
}
