package com.core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String uname = "vishnu";
	transient String pwd = "vardhan";
	
	private void writeObject(ObjectOutputStream os) throws IOException{
		os.defaultWriteObject();
		String epwd  = "123"+pwd;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException{
		is.defaultReadObject();
		String epwd = (String)is.readObject();
		pwd = epwd.substring(3);		
	}	
}

public class SerializableDemo{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Account a = new Account();
		FileOutputStream fos = new FileOutputStream("SerializableDemo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis = new FileInputStream("SerializableDemo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account ac = (Account)ois.readObject();
		
		System.out.println(ac.uname+" " +ac.pwd);		
		

	}

}
