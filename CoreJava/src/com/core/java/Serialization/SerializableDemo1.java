package com.core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{
	int i = 10;
	Animal(){
		System.out.println("Animal object");
		
	}
	
}
class Dog extends Animal implements Serializable{
	int j = 20;
	Dog(){
		System.out.println("Dog object");
		
	}
}

public class SerializableDemo1 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.i = 999;
		d.j = 888;
		System.out.println("Serialization is performed");
		
		FileOutputStream fos = new FileOutputStream("SerializableDemo1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		System.out.println("Desirialization is performed");
		FileInputStream fis = new FileInputStream("SerializableDemo1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		
		System.out.println(d1.i +"  " +d.j);

	}

}
