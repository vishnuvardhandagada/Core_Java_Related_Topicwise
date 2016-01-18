package com.core.java.Collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List l = new ArrayList();
		@SuppressWarnings("rawtypes")
		Map m = new TreeMap();
		@SuppressWarnings("rawtypes")
		Set s = new TreeSet();
		l.add(new Integer(1));
		l.add(new Integer(4));
		l.add(new Integer(3));
		l.add(new Integer(2));
		l.add(new Integer(3));
		m.put(new Integer(1), "A");
		m.put(new Integer(4), "B");
		m.put(new Integer(3), "C");
		m.put(new Integer(2), "D");
		m.put(new Integer(3), "E");
		System.out.println("Adding to Set");
		System.out.println("Adding 1: " + s.add(new Integer(1)));
		System.out.println("Adding 4: " + s.add(new Integer(4)));
		System.out.println("Adding 3: " + s.add(new Integer(3)));
		System.out.println("Adding 2: " + s.add(new Integer(2)));
		System.out.println("Adding 3: " + s.add(new Integer(3)));
		
		System.out.println("List");
		Iterator i = l.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		
		System.out.println("Map using keys");
		i = m.keySet().iterator();
		while (i.hasNext())
			System.out.println(m.get(i.next()));
		
		System.out.println("Map using entries");
		i = m.entrySet().iterator();
		while (i.hasNext())
			System.out.println(i.next());
		
		System.out.println("Set");
		i = s.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
