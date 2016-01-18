`package com.core.java.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergeData {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=new PrintWriter("E:/Practice/Corejava/Files/Merge3.txt");
		BufferedReader br=new BufferedReader(new FileReader("E:/Practice/Corejava/Files/Merge1.txt"));
		String Line=br.readLine();
		while(Line!=null)
		{
			pw.println(Line);
			Line=br.readLine();
		}
		br=new BufferedReader(new FileReader("E:/Practice/Corejava/Files/Merge2.txt"));
		Line=br.readLine();
		while(Line!=null)
		{
			pw.println(Line);
			Line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();

	}

}
