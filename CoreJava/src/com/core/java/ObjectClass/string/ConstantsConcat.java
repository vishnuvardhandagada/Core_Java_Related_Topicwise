package com.core.java.ObjectClass.string;

public class ConstantsConcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("abc");
		String s2 = new String("def");
		String s3 = s1;
		s1 = s1 + "ghi";
		System.out.println(s1+s2+s3);

	}

}
