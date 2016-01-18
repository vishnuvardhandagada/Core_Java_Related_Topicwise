package com.core.java.Interview;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the given number to check for prime or not");
		int num = sc.nextInt();
		
		if(primeNumber(num)){
			System.out.println("The given number is prime");
		}
		else
			System.out.println("The given number is not prime");		
	}

	private static boolean primeNumber(int num) {
		// TODO Auto-generated method stub
		if(num<=1)
			return true;
		
		for (int i = 2; i < num; i++) {
			
			if(num%i == 0)
				return false;		
				
		}
		return true;
	}

}
