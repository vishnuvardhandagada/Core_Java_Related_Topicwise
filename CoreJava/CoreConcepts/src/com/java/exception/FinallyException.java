package com.java.exception;

public class FinallyException {
	public static void main(String[] args) {
		try {
			System.out.println("This is try block ");
			int a = 10;
			int b = 0;
			//int c = a/b;
			//System.out.println("The sum of twp numbers is :"+c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is catch block : "+e);
		}
		finally{
			System.out.println("This is finally block");
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println("The sum of twp numbers is :"+c);
		}
	}

}
