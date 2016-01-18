package com.core.java.Interview;

import java.util.Scanner;

public class StringPermutations { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to all combinations");
		String str = sc.nextLine();
		combinations(str); 

	} 
	public static void combinations(String input){ 
		int count = 0;

		for(int i=0;i<input.length();i++){ 

			for(int j=0;j<input.length();j++){ 
				
			
				for(int k=0;k<input.length();k++){			

					if(i!=j){ 
						if(j!=k){
							System.out.print(input.charAt(i));
							System.out.print(input.charAt(j)); 
							System.out.println(input.charAt(k)); 
							count++;
						}

						
					}
				} 
			} 
		} 
		System.out.println("The total number of permutations are : "+count);

	} 
}