package com.core.java.Concepts;

public class CompareTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k = {1,3,5,7,9};
		int[] l = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < k.length; i++) {
			
			for (int j = 0; j < k.length; j++) {
				if(k[i] != l[j])
					System.out.println(l[j]);
				
			}
			
		}

	}

}
