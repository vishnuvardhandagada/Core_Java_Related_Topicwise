package com.core.java.ExceptionHandling;

public class TryWithCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("This is try block");
			int i=10, j=50;
			int c= j/0; 
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("This is catch block");
			e.printStackTrace();
			
		}
		finally{
			System.out.println("This is finally block");
		}

	}

}
