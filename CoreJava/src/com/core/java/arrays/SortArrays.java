//Arrays are sorting the in specified order
package com.core.java.arrays;

import java.util.Arrays;

public class SortArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = {"10", "vishnu","reddy", "good", "10", "20","vishnu"};
		
		
		System.out.print("Before sorting a String : ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(" "+s[i]);		
		}
		
		//appraoch 1
		System.out.println();
		System.out.print("sorting only some part of the arrays : ");
		Arrays.sort(s, 0,3);
		for(String str : s){
			System.out.print( " "+str);
		}
		
		/*//approach 2
		 * System.out.println();
		Arrays.sort(s);
		System.out.print("After sorting a String is in accending order : ");
		for (int i = 0; i < s.length ; i++) {
			System.out.print(" "+s[i]);		
		}*/
		
		System.out.println();
		
		/*Approach 3
		 * Arrays.sort(s);
		System.out.print("After sorting a String is in Decending order : ");
		for (int i = s.length-1; i >= 0 ; i--) {
			System.out.print(" "+s[i]);		
		}  //(OR)
		
		Arrays.sort(s, Collections.reverseOrder());
		for (int i = 0; i < s.length ; i++) {
			System.out.print(" "+s[i]);		
		}*/
		
		//System.out.println();
		System.out.println();
		
		/* for notes copying
		 * System.out.println("Sorting part of array in java:");
		int[] numbers = { 1, 3, 2, 5, 4 };
		Arrays.sort(numbers, 0, 3);
		System.out.print("Sorted sub array in Java : ");
		for (int num : numbers) {
			System.out.print(" "+num);
		}*/

	}

}
