package com.core.java.Interview;

class SuperDemo{
	int id;
	String name;
	SuperDemo(){
				
	}
	
	public void method(){
		System.out.println("This is Super class");
	}
	
	
}

public class PrivateDemo extends SuperDemo{

	protected PrivateDemo() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Super s = new Super(11, "abc");
		
		SuperDemo s = new PrivateDemo();
		s.method();
		

	}
	

	public void method(){
		System.out.println("This is PrivateDemo class");
	}

}
