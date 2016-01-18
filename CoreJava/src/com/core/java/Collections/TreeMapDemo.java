package com.core.java.Collections;

import java.util.TreeMap;

public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap tm = new TreeMap();
		
		//tm.put(null, "hello");
		
		tm.put("Vishnu", "Vardhan");
		tm.put("sai", "ram");
		//tm.put(null, "hello");
		tm.put("hello", null);
		System.out.println(tm.put("Vishnu", "Reddy"));
		tm.put("Sreeja", "Reddy");
		System.out.println("The Treemap <k,v> are :"+tm);
	}

}
