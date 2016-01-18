package com.core.java.ExceptionHandling;


public class TryWithMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int i=0;
			int c=10/i;
			System.out.println(c);
			
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catch (ArithmeticException e) {
			
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
