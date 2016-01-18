package com.core.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapToSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("java", 102);
		hm.put("Cobal", 100);
		hm.put("Html", 101);
		hm.put("Oracle", 105);
		hm.put("PHP", 103);
		
		System.out.println("HashMap object : " +hm);
		
		Set<String> a1 = new HashSet<String>();
		a1 = hm.keySet();
		System.out.println("The Set in keys are : " +a1);
		
		Collection<Integer> a2 = hm.values();
		System.out.println("The Collections values are  : " +a2);
		
		Set s = hm.entrySet();
		System.out.println("The HashMap in Set are : " +s);
	}

}
