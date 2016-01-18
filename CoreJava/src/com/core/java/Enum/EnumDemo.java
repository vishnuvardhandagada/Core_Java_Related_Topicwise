package com.core.java.Enum;

enum Human
{
	Vishnu, Sreeja,Manu, Vasu;
}

public class EnumDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human h=Human.Vasu;
		switch(h)
		{
			case Vishnu:
				System.out.println("his name is Vishnu");
				break;
			case Manu:
				System.out.println("his name is Manu");
				break;
			case Sreeja:
				System.out.println("his mane is Sreeja");
				break;
			default:
				System.out.println("Some other name is given");
		}

	}

}
