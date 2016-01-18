package com.core.java.Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable{
	
	String name;
	int no;
	int marks;
	public ExternalizationDemo()
	{
		System.out.println("this constructor will be excuted automatically at the time of deserialization");
	}
	public ExternalizationDemo(String name,int no,int marks)
	{
		this.name=name;
		this.no=no;
		this.marks=marks;
	}
	public void writeExternal(ObjectOutput os)throws IOException
	{
		os.writeObject(name);
		os.writeObject(no);
	}
	public void readExternal(ObjectInput is)throws IOException,ClassNotFoundException
	{
		name=(String)is.readObject();
		no=(Integer)is.readObject();
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ExternalizationDemo e1=new ExternalizationDemo("Vishnu",111,96);
		
		FileOutputStream fos=new FileOutputStream("E:/Practice/CoreJava/src/com/core/java/Serialization/Externalizable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		System.out.println(" before writing the file");
		oos.writeObject(e1);
		FileInputStream fis=new FileInputStream("E:/Practice/CoreJava/src/com/core/java/Serialization/Externalizable.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ExternalizationDemo e2=(ExternalizationDemo)ois.readObject();
		System.out.println(" after reading the file");
		System.out.println("Employee name : "+e2.name+" : number is : "+e2.no+" : marks is : "+e2.marks);
		

	}

}
