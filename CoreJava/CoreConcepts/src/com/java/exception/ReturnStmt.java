package com.java.exception;

public class ReturnStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The return statement is : "+method());

	}

	private static String method() {
		// TODO Auto-generated method stub
		try {
			return "Obul";
		} catch (Exception e) {
			// TODO: handle exception
			return "Bhaskar";
		}
		finally{
			return "Vishnu";
		}
		
	}

}
