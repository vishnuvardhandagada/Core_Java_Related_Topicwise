package com.core.java.Enum;

import java.io.File;
import java.io.IOException;

public class CreateDir {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*File f=new File("E:\\Vishnu");
		System.out.println(f.exists());
		f.mkdir();
		File f1=new File("E:\\Vishnu","Vishnu.txt");
		f1.createNewFile();
		System.out.println(f1.exists());*/
		
		File f=new File("Vishnu");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		
		File f1=new File("E:\\Vishnu","abc.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());

	}

}
