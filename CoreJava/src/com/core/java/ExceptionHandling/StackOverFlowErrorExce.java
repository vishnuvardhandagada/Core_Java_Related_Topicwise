package com.core.java.ExceptionHandling;

public class StackOverFlowErrorExce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();

	}

	private static void m1() {
		// TODO Auto-generated method stub
		
		m2();
		
	}

	private static void m2() {
		// TODO Auto-generated method stub
		m1();
		
	}
	

}
