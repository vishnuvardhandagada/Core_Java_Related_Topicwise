package com.core.java.Fundamental;

class Parent{
	static int a = 10;
	int b = 20;
	
	public void display(){
		System.out.println(" The Parent class values are : "+a+" : "+b);
	}
}
 
class Child extends Parent{
	int a = 30;
	int b = 40;
	public void display(){
		
		System.out.println("The Child class values are : "+Parent.a+" : "+b);
		
	}
}

public class VariablesAndMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();
		p.display();
		System.out.println("values are : "+p.a+" : "+p.b);

	}

}
