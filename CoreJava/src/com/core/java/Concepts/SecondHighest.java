//find the second highest number is an array

package com.core.java.Concepts;

public class SecondHighest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int temp = 0;
		int[] n = {30,50,88,20,40,60,89,1,89,40,88,55,69,10};
		
		secondHighest(n);

	}

	private static void secondHighest(int[] n) {
		// TODO Auto-generated method stub
		int first = n[0];
		int second = n[0];
		int third = n[0];
		//int f = System.in(args[0]);
		
		
		for (int i = 0; i < n.length; i++) {
			
			if(n[i] > first){
				//third = second;                           {30,50,20,40,60,89,1,89,40,88,55,69,10}
				if(first > second)                          //0  1  2  3  4  5 6  7  8  9  10 11 12
					second = first;
				
				first = n[i];				
			}
			else if((n[i] != first) && (n[i] > second) /*|| (first == second)*/){
				//third = second;
				//if(first > second)
				second = n[i];
			}			
			
			
			/*else if(n[i] > third)
				third = n[i];*/
			
		}
		System.out.println("The second highest value is : "+second);
	}

}
