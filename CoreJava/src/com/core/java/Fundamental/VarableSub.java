package com.core.java.Fundamental;

class Super{
	 private void m1(){
		System.out.println("This is super class");
	}
}

public class VarableSub extends Super{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s = new VarableSub();
		//s.m1();
	

	}
	public void m1() {
		System.out.println("This is Sub class method");
		
	}

}
