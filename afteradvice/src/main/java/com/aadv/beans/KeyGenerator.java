package com.aadv.beans;

import java.security.SecureRandom;

public class KeyGenerator {
	public int keyGenerator(int range) {
		SecureRandom random = new SecureRandom();
		int key = random.nextInt(range);
		return key;
	}
}
