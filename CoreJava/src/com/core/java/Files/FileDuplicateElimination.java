package com.core.java.Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDuplicateElimination {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br1=new BufferedReader(new FileReader("E:/Practice/Corejava/Files/FileDuplicateElimination1.txt"));
		PrintWriter pw=new PrintWriter("E:/Practice/Corejava/Files/FileDuplicateElimination2.txt");
		String target=br1.readLine();
		while(target!=null)
		{
			//System.out.println(target);
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("E:/Practice/Corejava/Files/FileDuplicateElimination2.txt"));
			String Line=br2.readLine();
			while(Line!=null)
			{
				System.out.println(Line);
				if(target.equals(Line))
				{
					available=true;
					break;
				}
				Line=br2.readLine();
			}
			System.out.println("iteration");
			
			if(available==false)
			{
				pw.println(target);
				pw.flush();
			}
			target=br1.readLine();
			
		}

	}

}
