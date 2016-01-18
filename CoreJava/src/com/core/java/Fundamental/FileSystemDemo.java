package com.core.java.Fundamental;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileSystemDemo { 

	public static void main(String argv[]){
		FileSystemDemo m=new FileSystemDemo(); 

	System.out.println(m.amethod()); 

} 

public int amethod() { 

	try {

		FileInputStream dis=new FileInputStream("Hello.txt"); 

		}catch (FileNotFoundException fne) { 

			System.out.println("No such file found"); 

			return -1; 

			}catch(IOException ioe) { 

			} finally{ 

					System.out.println("Doing finally"); 

			} 

			return 0; 

	} 

}



