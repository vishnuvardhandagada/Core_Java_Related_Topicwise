package com.core.java.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	String username="Scott";
	String pwd="Tiger";
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		oos.defaultWriteObject();
		String epwd="123"+pwd;
		oos.writeObject(epwd);
	}
	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject();
		String epwd=(String)ois.readObject();
		pwd=epwd.substring(3);
	}
}

public class CustomizedSeriaDemo
{
	public static void main(String args[]) throws Exception
	{
		Student s=new Student();
	    FileOutputStream fos=new FileOutputStream("E:/Practice/CoreJava/Files/CustomizedSeriaDemo.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);

		FileInputStream fis=new FileInputStream("E:/Practice/CoreJava/Files/CustomizedSeriaDemo.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s1=(Student)ois.readObject();

		System.out.println(s1.username+"  "+s1.pwd);
	}
}