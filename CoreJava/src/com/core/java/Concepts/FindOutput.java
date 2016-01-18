package com.core.java.Concepts;

public class FindOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(args[0]);
		loop(i);
		
		System.out.println(6%2);
		System.out.println(6/2);

	}
	
	public static void loop(int n) {
		int i = n;
		
		while (i > 0) {
			System.out.println(i);
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = i + 1;
			}
		}
	}

}
