package com.core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo1 implements Serializable{
	transient static int i = 10;
	transient final int j = 20;
	transient int k = 50;
	transient int l = 60;
	Demo1(){
		
	}
}

class Demo2 implements Serializable{
	static int i = 30;
	final int j = 40;
	Demo2(){
		
	}
}

public class SerializableDemo2{
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		
		FileOutputStream fs = new FileOutputStream("E:/Practice/CoreJava/src/com/core/java/Serialization/SerializableDemo2.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(d1);
		os.writeObject(d2);
		
		
		FileInputStream fis = new FileInputStream("E:/Practice/CoreJava/src/com/core/java/Serialization/SeriallizableDemo2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo1 d3 = (Demo1)ois.readObject();
		Demo2 d4 = (Demo2)ois.readObject();
		
		System.out.println("Demo1 Objects : " +d3.i+" "+d3.j+" "+d3.k+" "+d3.l  );
		System.out.println("Demo2 Objects : " +d4.i+" "+d4.j  );
		
		
		
	}
	

	
}