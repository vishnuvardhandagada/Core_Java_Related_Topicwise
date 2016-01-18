//Find arrays has duplicate elements are there are not


package com.core.java.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"10", "vishnu","reddy", "good", "10", "20","vishnu"};
		String[] s1 = {"10", "vishnu","reddy", "good",  "20"};
		HashSet hs = new HashSet();
		/*for (int i = 0; i < s.length; i++) {
			hs.add(s[i]);
		}*/
		System.out.print("String values are  : ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(" "+s[i]);
		}
		System.out.println();
		//System.out.println("HashSet values are :"+ hs);
		
		/*  // Approach 1
		if(s.length>hs.size())
			System.out.println("Arrays contains duplicate elements");
		else
			System.out.println("Arrays does't contains duplicate elements");	
		
*/
		
		/*//  Approach 2
		for (int i = 0; i < s.length; i++) {
			System.out.println(hs.add(s[i]));
		}
		//(OR) */
		
		Set h = new HashSet();
		for(String str : s){
			if(!hs.add(str)){
				System.out.println("Array contains duplicate elements");
				break;
			}			
		}
		
		/*  // Approach 3
		System.out.println("Checking array with duplicate using brute force: " + check(s));
        System.out.println("Checking array without any duplicate using brute force: " + check(s1));

		*/
		
	}
	public static boolean check(String[] name){
		
		for (int i = 0; i < name.length; i++) {
			
			for (int j = 0; j < name.length; j++) {
				
				if(name[i].equals(name[j]) && i!=j){
					
					return true;
				}
				
			}
			
		}
		return false;
	}
	
}
