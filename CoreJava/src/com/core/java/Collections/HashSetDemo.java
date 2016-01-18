package com.core.java.Collections;

import java.util.HashSet;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add("Vishnu");
		hs.add("vijay");
		System.out.println(hs.add(null));
		hs.add("Vishnu");
		hs.add(20);
		
		System.out.println(hs.add(null));
		System.out.println("The HashSet values are : "+hs);
		

	}

}
