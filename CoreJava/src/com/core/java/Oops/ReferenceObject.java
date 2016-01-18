package com.core.java.Oops;

class Person{
	
}

class Vehical extends Person{
	
}

public class ReferenceObject {

	/**
	 * @param args
	 */
	public void display(Person p){
		System.out.println("Person is Displayed");
	}
	
	public void display(Vehical v){
		System.out.println("Vehical is Displayed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReferenceObject r = new ReferenceObject();
		
		Person p = new Person();
		r.display(p);
		
		Vehical v = new Vehical();
		r.display(v);
		
		Person pv = new Vehical();
		r.display(pv);

	}

}
