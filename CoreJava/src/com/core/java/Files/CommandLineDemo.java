package com.core.java.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CommandLineDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many Strings : ");
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		for(int i=0; i<n; i++){
			
			System.out.println("Enter "+(i+1)+" String values :");
			
			str[i] = br.readLine();
			
		}
		for(int i=0; i<n; i++){
			System.out.print(str[i]+" ");
		}
		

	}

}
