package com.core.java.Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class BufferReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("E:/Practice/CoreJava/Files/BufferWriterDemo.txt");
		BufferedReader br = new BufferedReader(fr);
		String content = br.readLine();
		while(content!=null){
			System.out.println(content);
			content = br.readLine();
		}
		br.close();

	}

}
