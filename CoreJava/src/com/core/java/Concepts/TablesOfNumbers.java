package com.core.java.Concepts;

import java.io.InputStream;

public class TablesOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(args[0]);
		printMultTable(i);
		

	}

	public static void printMultiples(int n, int high) {
		int i = 1;
		while (i <= high) {
			System.out.print(n * i + " ");
			i = i + 1;
		}
		System.out.println("");
	}
	
	//It prints full table
	public static void printMultTable(int high) {
		int i = 1;
		while (i <= high) {
			printMultiples(i, high);
			i = i + 1;
		}
	}
	
	//It prints the half of  half the table only
	/*public static void printMultTable(int high) {
		int i = 1;
		while (i <= high) {
			printMultiples(i, i);
			i = i + 1;
		}
	}*/
}
