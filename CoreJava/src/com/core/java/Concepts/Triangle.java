package com.core.java.Concepts;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for Triangle
		for (int i = 0; i < 5; i++) {
			//System.out.println("* ");
			//System.out.println("  ");
			for (int j = 5; j >= 0; j--) {
				if(i >= j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		/*// total is Diamond shape
		for (int i = 0; i < 5; i++) {
			//System.out.println("* ");
			//System.out.println("  ");
			for (int j = 0; j < 5; j++) {
				if(i <= j)
					System.out.print(" *");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
		
		/*// reverse triangle
		for (int i = 0; i < 5; i++) {
			//System.out.println();
			for (int j = 0; j < 5; j++) {
				if(i <= j)
					System.out.print("* ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			
		}*/
		
		/*//Print diagonal
		for (int i = 0; i < 5; i++) {
			//System.out.println();
			for (int j = 0; j < 5; j++) {
				if(i == j)
					System.out.print("* ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			
		}*/
		
		

	}

}
