package com.core.java.ExceptionHandling;

public class FinallyBlockReturn {
	
	public static void main(String[] args) {
		
		int i = 10,j;
		m1(i);
		
	}
	@SuppressWarnings("finally")
	private static int m1(int i) {
		// TODO Auto-generated method stub
		try {
			int j;
			System.out.println("this is try block");
			j = i/0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("this is caught block");
			e.printStackTrace();
		}
		finally{
			System.out.println("this is finally block");
			if(i==10)
				return i;
			
			
			
			System.out.println("this is end of the finally block");
			
		}
		return i;
	}

}
