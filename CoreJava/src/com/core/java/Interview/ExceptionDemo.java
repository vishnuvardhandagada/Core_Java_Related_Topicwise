package com.core.java.Interview;

public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic exception is rised");
			System.exit(0);
		}finally{
			System.out.println("this is final");
		}

	}

}
