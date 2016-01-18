package com.core.java.Interview;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new HashSet();
		
		s.add(2);
		s.add(1);
		s.add(10);
		s.add(85);
		s.add(3);
		System.out.println(s);
		
		Set s1 = new TreeSet();
		
		s1.add(2);
		s1.add(1);
		s1.add(10);
		s1.add(85);
		s1.add(3);
		System.out.println(s1);

	}

}
