package com.core.java.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("E:/Practice/CoreJava/Files/BufferWriterDemo.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch={'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("durga");
		bw.newLine();
		bw.write("software solution");
		bw.flush();
		bw.close();

	}

}
