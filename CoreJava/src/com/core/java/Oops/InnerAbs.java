package com.core.java.Oops;

interface inter
{
	public void m1();
	public void m2();
	public abstract void m3();
}
abstract class abstra implements inter
{
	public void m11(){ }
	public abstract void m22();
	public abstract void m33();
}


public class InnerAbs extends abstra 
{
	/**
	 * @param args
	 */
	
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}
	public void m1(){
		System.out.println("Hello World11111111!");
	}
	public void m2(){
		System.out.println("Hello World22222!");
	}	
	public void m22(){
		System.out.println("Hello World133333!");
	}
	public void m33(){
		System.out.println("Hello World444444!");
	}

}