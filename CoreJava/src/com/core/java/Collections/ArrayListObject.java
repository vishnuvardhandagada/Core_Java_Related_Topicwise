package com.core.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int sno,age;
	String sname;
	Student(int sno,String sname,int age)
	{
		this.sno=sno;
		this.sname=sname;
		this.age=age;
	}
}


public class ArrayListObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(101,"Vishnu",11);
		Student s2=new Student(104,"Sreeja",12);
		Student s3=new Student(103,"Manu",9);
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Student st=(Student)it.next();
			System.out.println(st.sno+" "+st.sname+" "+st.age);
		}
	}

}


