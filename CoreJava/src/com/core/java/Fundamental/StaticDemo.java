package com.core.java.Fundamental;

public class StaticDemo {

	/**
	 * @param args
	 */
	static int i=10;
	static 
	{
		//System.out.println(j);-----> illegal forward reference
		m1();
		System.out.println("First static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
		System.out.println("main method");
	}
	
	public static void m1()
	{
		System.out.println(j);
	}
	static
	{
		System.out.println("second static block");
	}
	static int j=20;

}
