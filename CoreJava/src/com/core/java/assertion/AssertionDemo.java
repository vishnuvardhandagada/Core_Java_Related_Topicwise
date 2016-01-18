package com.core.java.assertion;

import java.util.Scanner;

public class AssertionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner( System.in );
		System.out.print("Enter ur age ");
		int value = scanner.nextInt();
		assert value>=18:" Not valid";
		System.out.println("value is "+value);

	}

}
