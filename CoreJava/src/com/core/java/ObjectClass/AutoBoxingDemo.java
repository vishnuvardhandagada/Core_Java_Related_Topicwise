package com.core.java.ObjectClass;

public class AutoBoxingDemo {

	/**
	 * @param args
	 */
	
	static Integer I=10; //Integer I=new Integer(10)--->auto boxing
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = I;
		m1(i);
		System.out.println("The int value is :" +i);
		int k = 10;
		int j = 20;
		//System.out.println(k.equals(j));

	}
	public static void m1(Integer l)
	{
		int k=l;
		System.out.println(k);
	}

}
