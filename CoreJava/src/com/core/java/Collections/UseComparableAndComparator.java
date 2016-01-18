package com.core.java.Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class UseComparableAndComparator {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws java.io.IOException {
		String[] names = { "Sue", "Bill", "Tom", "Dave", "Andy", "Mary",
				"Beth", "Bill", "Mike" };
		System.out.println("Given String Array Values are : ");
		for (int i = 0; i < names.length; i++) {
			
			System.out.print(names[i]+" " );
		}
		System.out.println();
		@SuppressWarnings("unchecked")
		TreeSet sl = new TreeSet(Arrays.asList(names));
		Iterator it = sl.iterator();
		System.out.println("Array to TreeSet: ");
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		@SuppressWarnings("unchecked")
		TreeSet s2 = new TreeSet(new ReverseComparator());
		s2.addAll(Arrays.asList(names));
		it = s2.iterator();
		System.out.println("using our own class using comparator interface : ");
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	
}

class ReverseComparator implements Comparator {
	ReverseComparator() {
	}

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof String && o2 instanceof String)
			return -((String) o1).compareTo((String) o2);
		else
			throw new ClassCastException("Objects are not Strings");
	}
}
