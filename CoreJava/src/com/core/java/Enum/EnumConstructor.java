package com.core.java.Enum;

enum Country{
	 india, australia, southafrica, westindies;
	 Country(){
		 System.out.println("enum constructor is excecuted");
	 }
	
}

public class EnumConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c = Country.india;
		//System.out.println("Excecuting main method");
		
		for(Country c1 : c)
			System.out.println(c1);

	}

}
