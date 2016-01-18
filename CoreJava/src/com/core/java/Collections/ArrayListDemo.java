package com.core.java.Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList a=new ArrayList(5);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.ensureCapacity(5);
		
		System.out.println("1st size :"+a.size());
		a.add(5);
		a.add(1);
		System.out.println("2nd size :"+a.size());
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("3rd size :"+a.size());
		a.add(5);
		a.add(1);
		System.out.println("4th size :"+a.size());
		System.out.println(a.isEmpty());
		System.out.println(a);
		
		System.out.println(a.get(1));
	
		System.out.println(a.contains("Mohan"));
		System.out.println(a.indexOf("Mohan"));
		@SuppressWarnings("rawtypes")
		HashSet h=new HashSet(a);
		System.out.println(h);
		System.out.println(a.size()-h.size());
		//h.size();
		System.out.println(a);
		a.clear();
		System.out.println(a.isEmpty());

	}

}
