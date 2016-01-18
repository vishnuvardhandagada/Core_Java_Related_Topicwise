package com.core.java.Concepts;

import java.util.ArrayList;

public class PrimeList {
	public static void main(String[] args) {
		primeNumber(100);
	}

	public static void primeNumber(int end) {
		ArrayList<Boolean> primeNumbers = new ArrayList<Boolean>();
		for (int i = 0; i < end; i++) {
			primeNumbers.add(i, true);
		}
		for (int i = 2; i < primeNumbers.size(); i++) {
			if (primeNumbers.get(i)) {
				for (int j = i + i; j < primeNumbers.size(); j += i) {
					primeNumbers.set(j, false);
				}
			}
		}
		for (int j = 2; j < primeNumbers.size(); j++) {

			if (primeNumbers.get(j)) {
				System.out.println(j);
			}
		}
	}
}
