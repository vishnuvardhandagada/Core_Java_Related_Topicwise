package com.core.java.Fundamental;

class Define1{
	
}
class Define2 extends Define1{
	
}

public class DefineMethod {

	/**
	 * @param args
	 */
	
	public void method(Define1 d){
		System.out.println("This is Define1 method");
	}
	
	public void method(Define2 d){
		System.out.println("This is Define2 method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefineMethod d = new DefineMethod();
		Define1 d1 = new Define1();
		d.method(d1);
		Define2 d2 = new Define2();
		d.method(d2);
		Define1 d3 = new Define2();
		d.method(d3);

	}

}
