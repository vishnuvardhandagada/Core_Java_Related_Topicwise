package com.core.java.Oops;

class B
{
	public void m1(){
		System.out.println(" this is B class m1()");
	}
	
}
public class SimpleDemo extends B{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDemo a = new SimpleDemo();
		a.m1();
		
		B b = new B();
		b.m1();
		
		/*A a1 = (A) new B();
		a1.m1();*/
		
		B b1 = new SimpleDemo();
		b1.m1();
		
		Exception e = new Exception();
		Throwable t = (Throwable)e;
		Throwable t1 = new Throwable();
		System.out.println("this is exception class"+e.getClass());
		System.out.println("this is Throwable class"+t.getClass());
		System.out.println("this is Throwable class"+t1.getClass());



	}
	public void m1(){
		System.out.println("this is A class m1()");
	}

}
