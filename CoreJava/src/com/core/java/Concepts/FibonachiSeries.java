package com.core.java.Concepts;

public class FibonachiSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.println("The Fibonachi series is : ");
		for(int i=0; i<=10; i++){
			
			c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}

	}

}
