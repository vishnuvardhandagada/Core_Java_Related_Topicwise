package com.core.java.Oops;

class A{
	public void m1(){
		System.out.println("This is m1() in A");
	}
}
class C extends A{
	public void m1(){
		System.out.println("This is m1() in C");
	}
	public void m2(){
		System.out.println("This is m2() in C");
	}
}

public class BasicCon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		a.m1();
		a.m2();

	}

}
