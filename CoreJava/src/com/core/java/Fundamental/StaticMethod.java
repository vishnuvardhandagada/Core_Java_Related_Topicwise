package com.core.java.Fundamental;

class StaticMethod1{
	public static void method(){
		System.out.println("This is StaticMethod1 method");
	}	
}

class StaticMethod2 extends StaticMethod1{
	public  static void method(){
		System.out.println("This is StaticMethod2 method");
	}
}

public class StaticMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod1 d = new StaticMethod2();
		d.method();

	}
	public  static void method(){
		System.out.println("This is main method");
	}

}
