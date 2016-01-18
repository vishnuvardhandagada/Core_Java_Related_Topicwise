package com.core.java.ObjectClass;

public class AutoBoxingConversion {

	/**
	 * @param args
	 */
	/*public void boxing(int i){
		System.out.println("The value of primitive value is : "+i);
	}*/
	
	public void boxing(Integer i){
		System.out.println("The value of Wrapper class object is : "+i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoBoxingConversion a = new AutoBoxingConversion();
		int i = 10;
		
		a.boxing(i);
		
		

	}

}
