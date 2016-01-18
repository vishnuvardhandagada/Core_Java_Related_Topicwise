package com.core.java.Operators;

public class UnaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		i=i+i;
		System.out.println("1st : " +i);
		
		i=i++;
		//i+=i;
		System.out.println("2nd : " +i);
		
		i=++i;
		System.out.println("3rd : " +i);
		
		i=i++ + ++i;
		System.out.println("4th : " +i);
		
		
		//System.out.println("I value is : " +i);
		
		//i++;
		i++;
		 
		System.out.println(" After i value is : "+i);
		

	}

}