package com.core.java.Oops;

class Account
{
	int acid;
	String branch;
	float bal;

	//constructor
	/*Account()
	{
		System.out.println("Zero -arg constructor");
		branch="n.guda";
		bal=250;
	}
	Account(String br,float tbal)
	{
		System.out.println("param  constructor");
		branch=br;
		bal=tbal;
	}*/

	void putDetails(int x,String y,float z)
	{
		acid=x;
		branch=y;
		bal=z;
	}
	void getDetails()
	{
		System.out.println(acid+"  "+branch+"  "+bal);
	}
}//class

public class ConstructorDemo{

	public static void main(String args[])
	{
		Account a1=new Account();
		a1.getDetails();

		a1.putDetails(101,"ameer pet",7800);
		a1.getDetails();

		/*Account a2=new Account("s.r",750);
		a2.getDetails();
		a2.putDetails(013,"s.r",6789);
		a2.getDetails();*/
	}//main
}//class

	
