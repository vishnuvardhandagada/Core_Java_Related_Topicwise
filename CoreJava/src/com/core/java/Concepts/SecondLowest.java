package com.core.java.Concepts;

public class SecondLowest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {30,50,88,20,40,60,89,1,89,40,1,88,55,69,10};
		
		secondHighest(n);

	}

	private static void secondHighest(int[] n) {
		// TODO Auto-generated method stub
		int first = n[0];
		int second = n[0];
		
		for (int i = 0; i < n.length; i++) {
			if(n[i] < first){
				second = first;
				first = n[i];
			}
			else if((n[i] != first) && (n[i] < second))
				second = n[i];
			
		}
		System.out.println("The second lowest number : "+second);
	}

}
