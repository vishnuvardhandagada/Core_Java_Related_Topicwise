package com.core.java.Concepts;

import java.util.Arrays;

public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNumber(100);

	}

	public static void primeNumber(int end) {
		boolean primeNumbers[] = new boolean[end];
		for (int i = 0; i < end; i++) {
			primeNumbers[i] = true;
		}
		for (int i = 2; i < primeNumbers.length; i++) {
			if (primeNumbers[i]) {
				for (int j = i + i; j < primeNumbers.length; j += i) {
					primeNumbers[j] = false;
				}
			}
		}
		for (int j = 2; j < primeNumbers.length; j++) {
			if (primeNumbers[j]) {
				System.out.println(j);
			}
		}
	}
}
