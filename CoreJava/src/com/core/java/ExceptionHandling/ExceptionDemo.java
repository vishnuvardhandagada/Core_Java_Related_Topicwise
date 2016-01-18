package com.core.java.ExceptionHandling;

class  Demo{
	public void m1()
	{
		System.out.println("this is m1() in Demo class");
	}

	public char[] length() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class ExceptionDemo {

	/**
	 * @param args
	 */
	static String s;
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
			Demo d = new Demo();
			
			System.out.println(d.length());
		
			throw new ArithmeticException();
			

	}

}

