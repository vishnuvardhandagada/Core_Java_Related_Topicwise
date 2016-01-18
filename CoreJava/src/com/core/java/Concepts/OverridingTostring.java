package com.core.java.Concepts;



public class OverridingTostring {

	public OverridingTostring(String string) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingTostring o = new OverridingTostring("This is overriding main method");
		
		System.out.println(o);
		
		System.out.println(o.toString());
		

	}
	public String toString(){
		return "hello";
		
	}

}
