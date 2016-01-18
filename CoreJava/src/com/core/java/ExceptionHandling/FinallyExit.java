//finally block not excecuted but we can't expect the output

package com.core.java.ExceptionHandling;

public class FinallyExit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		
		int i=10, j=50;
		int c=0;
		try {
			
			System.out.println("This is try block");
			c = j/0;
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("This is catch block");
			e.printStackTrace();
			
		}
		finally{
			
			System.out.println("This is finally block");
			
			//System.out.println("String length is : " +str.length());
			
			System.out.println("This is after NullPointerException ");
			
			//c=i/0;
			
			System.out.println("This is after ArthemeticException");
			
			System.exit(0);
			
			System.out.println("After exit the statement");
		}

	}

}
