package com.core.java.ObjectClass.string;

public class StringConcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("soap");
		s.concat("hot");
		System.out.println("Before method call is : " +s);
		String s1 = method(s);
		System.out.println("The s & s1 Strings are : "+s+ " "+s1);
		
		String s2 = new String("spring");
		s2.concat("winter");
		s2 = s2 + "fall";
		String s3 = new String(s2.concat("summer"));
		s3.concat("fall");
		System.out.println("The given two S2 & s3 are : "+s2+ " " +s3);

	}

	private static String method(String s) {
		// TODO Auto-generated method stub
		s = s + "sweet";
		System.out.println("method String is : "+ s);
		return s;
	}

}
