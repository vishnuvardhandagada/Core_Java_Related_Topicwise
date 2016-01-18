package com.core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransStatic implements Serializable{

	/**
	 * @param args
	 */
	transient final int i = 10;
	transient static int j = 20;
	static int k = 30;
	final int l = 40;
	transient int m = 50;
	
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		TransStatic t = new TransStatic();
		
		FileOutputStream fos = new FileOutputStream("E:/Practice/CoreJava/src/com/core/java/Serialization/TransStatic.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		
		FileInputStream fis = new FileInputStream("E:/Practice/CoreJava/src/com/core/java/Serialization/TransStatic.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransStatic ts = (TransStatic)ois.readObject();
		
		 System.out.println("Trans Final i = "+ts.i);
		 System.out.println("Trans Static j = "+ts.j);
		 System.out.println("Static k = "+ts.k);
		 System.out.println("Final l = "+ts.l);
		 System.out.println("Transient m = "+ts.m);

	}

}
