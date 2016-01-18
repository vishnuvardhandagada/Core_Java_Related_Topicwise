package com.core.java.Fundamental;

public class Vararg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m();
		m(10);
		m(10,20);
		m(10,20,30);

	}

	static void m(int... a) {
		// TODO Auto-generated method stub
		int total=0;
		for(int x:a){
			total = total + x;
		}
		System.out.println("total : "+total);
	}

}
