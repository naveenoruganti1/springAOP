package com.tadv.beans;

public class Thrower {
	public int validate(int i) {
		if(i<=0) {
			throw new IllegalArgumentException("Invalid input of i");
		}
		return i;
	}
}
