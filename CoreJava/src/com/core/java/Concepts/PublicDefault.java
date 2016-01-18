package com.core.java.Concepts;

class Demo{
	public void display(int i){
		System.out.println("Demo is  : "+i);
	}
}
public class PublicDefault extends Demo{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new PublicDefault();
		d.display(10);

	}
	void display(int i){
		System.out.println("Demo is  : "+i);
	}

}
