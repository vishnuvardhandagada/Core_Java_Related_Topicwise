// To compare two ArrayList Objects are equal or not with the content

package com.core.java.Collections;

import java.util.ArrayList;

public class ArrayListHashDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		
		System.out.println("First ArrayList Values are : "+al);
		
		@SuppressWarnings("rawtypes")
		ArrayList al1 = new ArrayList();
		al1.add(15);
		al1.add(10);
		al1.add(20);
		al1.add(25);
		
		System.out.println("Second ArrayList Values are : "+al1);
		
		System.out.println(al.hashCode());
		System.out.println(al1.hashCode());
		
		System.out.println(al.equals(al1));
		

	}

}
