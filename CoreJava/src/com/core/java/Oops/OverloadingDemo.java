package com.core.java.Oops;

public class OverloadingDemo {
	
	int a=10;
	int b=20;
	public static void main(String[] args) {
		
		OverloadingDemo o = new OverloadingDemo();
		o.add(10);
		o.add1(40);
		
	}
	
	public void add(int d){
		int c = a + b +d;
		System.out.println(" the addition of three numbers is : " +c);
	}
	public int add1(int d){
		int c = a + b +d;
		System.out.println(" the return addition of three numbers is : " +c);
		return c;
	}

}
