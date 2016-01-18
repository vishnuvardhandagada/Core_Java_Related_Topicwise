package com.core.java.Oops.Overloading;

 class Animal{}
 
 class Monkey extends Animal{}
 
public class AnimalMonkeyEx {
	public void m1(Animal a){
		System.out.println("Animal version");
	}
	
	public void m1(Monkey a){
		System.out.println("Monkey version");
	}
	
	public static void main(String[] args) {
		AnimalMonkeyEx am = new AnimalMonkeyEx();
		Animal a = new Animal();
		Monkey m = new Monkey();
		Animal a1 = new Monkey();
		am.m1(a);
		am.m1(m);
		am.m1(a1);
	}

}
