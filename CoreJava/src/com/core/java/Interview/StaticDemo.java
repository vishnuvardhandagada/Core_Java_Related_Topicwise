package com.core.java.Interview;

class Static1{
	public static void m1(){
		System.out.println("this is static method of static1");
	}
	public void m2(){
		System.out.println("this is instance method of static1");
	}
}

class Static2 extends Static1{
	public static void m1(){
		System.out.println("this is static method of static2");
	}
	public void m2(){
		System.out.println("this is instance method of static2");
	}
}

public class StaticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static1 s1 = new Static2();
		s1.m1();
		s1.m2();
		Static2 s2 = new Static1();
		s1.m1();
		s1.m2();

	}

}
