package com.core.java.ObjectClass;

public class BoxingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pass Integer where int expected
		explode(new Integer(3));
		
		// pass literal where Boolean expected
		tellTruth(true);
		
		// calculate "int-erchangably" with int and Integer
		Integer integerYear = new Integer(1989);
		Integer otherIntegerYear = integerYear + 10;
		//int intYear = integerYear + new Integer(15);
		int intYear = 1988;
		log("integerYear : " +integerYear.toString());
		log("otherIntegerYear : "+otherIntegerYear.toString());
		System.out.println("int Year  : " +intYear);
		System.out.println("Hashing codes : ");
		System.out.println("-------------------------------------");
		System.out.println("integerYear : "+integerYear.hashCode());
		System.out.println("integerYear : "+otherIntegerYear.hashCode());
		//System.out.println("integerYear : "+intYear.hashCode());
		System.out.println("--------------------------------------");
		
		/*
		 * Comparison of primitives and wrapper objects using == and equals.
		 * 
		 * When both items are of the same type : 2 primitives 2 objects
		 * ---------------------------------------------------------- == : value
		 * identity equals() : not applicable value *
		 * 
		 * When one item is a primitive, and the other is an object : == : treat
		 * as two primitives x.equals(y) : treat as two objects; do not compile
		 * if x is primitive
		 */
		intYear = 1880;
		integerYear = new Integer(1880);
		if (intYear == integerYear) {
			log("intYear == integerYear: TRUE"); // yes
		} else {
			log("intYear == integerYear : FALSE");
		}
		if (integerYear.equals(intYear)) {
			log("integerYear.equals(intYear): TRUE"); // yes
		} else {
			log("integerYear.equals(intYear): FALSE");
		}
		// does not compile "int cannot be dereferenced" :
		// intYear.equals(integerYear);
		intYear = 1881; // new value
		if (intYear == integerYear) {
			log("intYear == integerYear: TRUE");
		} else {
			log("intYear == integerYear : FALSE"); // yes
		}
		if (integerYear.equals(intYear)) {
			log("integerYear.equals(intYear): TRUE");
		} else {
			log("integerYear.equals(intYear): FALSE"); // yes
		}
	}

	// PRIVATE //
	private static void explode(int aNumTimes) {
		log("Exploding " + aNumTimes + " times.");
	}

	private static void tellTruth(Boolean aChoice) {
		// instead of if ( aChoice.booleanValue() ) {
		if (aChoice) {
			log("Telling truth.");
		} else {
			log("Lying like a rug.");
		}
	}

	private static void log(String aText) {
		System.out.println(aText);
	}
}
