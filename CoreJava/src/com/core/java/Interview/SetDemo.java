package com.core.java.Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Employee{
	int id;
	String name;
	public Employee(int id, String name){
		this.id = id;
		this.name = name;		
	}
}

public class SetDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(11, "vishnu");
		Employee e2 = new Employee(11, "vishnu");
		@SuppressWarnings("rawtypes")
		Set s1 = new HashSet();
		s1.add(e1);
		s1.add(e2);
		System.out.println("The set values are : " +s1.toString());	
		
		Employee e = new Employee(11, "vishnu");
		Set s = new HashSet();
		s.add(e);
		s.add(e);
		System.out.println("The set contains : " +s.toString());
		
	
	}

}
