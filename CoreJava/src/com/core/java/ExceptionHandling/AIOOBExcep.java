package com.core.java.ExceptionHandling;

public class AIOOBExcep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Vishnuvardhan");
		System.out.println("the value is : " +s.indexOf('v'));
		
		System.out.println(s.indexOf('w'));
		
		System.out.println(s.indexOf(5, 9));
		
		int[] i = new int[3];
		System.out.println(i[2]);
		System.out.println(i[3]);

	}

}
