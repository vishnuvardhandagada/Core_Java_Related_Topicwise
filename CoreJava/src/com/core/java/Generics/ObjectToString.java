package com.core.java.Generics;

import java.util.ArrayList;
import java.util.List;

class Student{
	int i;
	String name;
	Student(int i, String name){
		this.i = i;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+"  "+name;
	}
}

public class ObjectToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l = new ArrayList<Object>();
		List<String> l1 = new ArrayList<String>();
		List<?> l3 = new ArrayList<Object>();
		
		
		/*l.add("vishnu");
		l.add(10);
		l.add(10.5f);
		System.out.println("List<Object> is : "+l);*/
		
		l1.add("reddy");
		l1.add("vardhan");
		l1.add("anantapur");
		//l1.add(10);
		System.out.println("List<String> is : "+l1);
		
		List<String> l2 = new ArrayList<String>();
		l2 = l1;
		//l = l2;
		System.out.println("List<String> is : "+l2);
		
		
		Student s1 = new Student(101,"vishnu");
		Student s2 = new Student(102, "vardhan");
		l.add(l2);
		l.add(s1);
		l.add(s2);
		System.out.println("List<Object> is : "+l);
		
		l3 = l;
		//l3 = l1;
		System.out.println(l3);

	}

}
