package com.core.java.Concepts;

public class FindPower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(pow(2,5));

	}
	
	public static int pow(int x, int n) {
		
		int i, j;
		if (n == 0)
			return 1;
		//System.out.println(n);
		// find x to the n/2 recursively
		int t = pow(x, n / 2);
		
		//System.out.println(n);
		// if n is even, the result is t squared
		// if n is odd, the result is t squared times x
		if (n % 2 == 0) {
			i = t*t;
			return t * t;
		} else {
			j = t*t*x;
			return t * t * x;
		}
	}

}
