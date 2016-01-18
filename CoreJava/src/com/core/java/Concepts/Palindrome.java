package com.core.java.Concepts;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for integers
		int  n = 525;
		int t = n;
		int r;
		int sum = 0;
		while(n>0){
			
			r = n%10;
			sum = sum *10 + r;
			n = n/10;
		}
		if(t == sum)
			System.out.println("palindrome");
		else 
			System.out.println("not palindrome");
		
		//for Strings
		String s = new String("mam");
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if(s.equals(sb.toString())){
			System.out.println("given String is palindrome");
		}
		else
			System.out.println("given String is not palindrome");

	}

}
