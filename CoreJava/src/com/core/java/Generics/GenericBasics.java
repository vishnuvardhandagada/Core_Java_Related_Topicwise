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
}

public class GenericBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> l = new ArrayList<Number>();
		l.add(10);
		l.add(10.5f);
		l.add(500);
		l.add(25.9);
		l.add(569521456);
		l.add('a', null);
		//l.addAll(true);
		System.out.println(l);
		
		Student s = new Student(101, "vishnu");
		Student s1 = new Student(102, "vardhan");
		
		
		ArrayList<?> al = new ArrayList<Integer>();
		
		ArrayList<?> al1 = new ArrayList<String>();
		
		ArrayList<?> a5 = new ArrayList();
		
		ArrayList<? extends Number> al2 = new ArrayList<Integer>();
		
		ArrayList<? extends Number> al3 = new ArrayList<String>();  		//Incompatable types
		
		ArrayList<? extends Runnable> al4 = new ArrayList<Thread>();
		
		ArrayList<? extends String> al5 = new ArrayList<Integer>();          //Incompatable types
		
		ArrayList<? extends Object> al6 = new ArrayList<String>();
		
		ArrayList<? extends Object> al7 = new ArrayList<StringBuffer>();
		
		ArrayList<? extends Object> al8 = new ArrayList<Integer>();
		
		ArrayList<? super Integer> al9 = new ArrayList<Number>();
		
		ArrayList<? super Integer> a = new ArrayList<Byte>();				 //Incompatable types
		
		ArrayList<? super Double> a4 = new ArrayList<Number>();			
		
		ArrayList<? super Object> a1 = new ArrayList<String>();				//Incompatable types
		
		ArrayList<? super Object> a5 = new ArrayList<Integer>();			//Incompatable types
		
		ArrayList<? super String> a6 = new ArrayList<Object>();
		
		ArrayList<?> a2 = new ArrayList<?>();								//Cannot instantiate
		
		ArrayList<?> a3 = new ArrayList<?extends Number>();					//Cannot instantiate
		
		//null value is added to all objects when extending or super classes also
		
		al9.add(10);
		//al9.add(10.5f);
		al9.add(null);
		
		al8.add(50);
		al8.add(null);          //null only acceptable remaining once throws an errors when object is extended
		
		//a4.add(20);
		//a4.add(10.5f);
		a4.add(30.4);
		
		a5.add("vishnu");
		a5.add(10);
		a5.add(new StringBuffer());
		a5.add(s);
		
		a6.add("vishnu");
		//a6.add(s);
		
	}

}
