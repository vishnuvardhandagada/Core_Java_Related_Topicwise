package com.core.java.Oops;

abstract class Prog1{
	
	public abstract void m1();
	public void m2(){
		System.out.println(" this is m2() of Prog1");
		
	}
	
	
}
public class DemoProg extends Prog1{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method");
		DemoProg p = new DemoProg();
		Prog1 d = new DemoProg(){
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("this is innerclass prog of m1()");
				
			}
		};
		d.m1();
		d.m2();
		
		p.m1();
		
		p.m2();

	}
	public void m1(){
		System.out.println("this is m1() of DemoProg");
	}
	public void m2(){
		System.out.println(" this is m2() of DemoProg");
		
	}

}
