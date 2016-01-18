//if we are defining our own sorting order by comparator then objects are  need not be 
//completed and homogenious.

package com.core.java.Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object>{

	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1<l2)
			return -1;
		else if(l1>l2)
			return 1;
		else
		//	return -s1.compareTo(s2);
		return s1.compareTo(s2);
	}
	
}

public class ComparatorDemo {
	public static void main(String[] args) {
		TreeSet<CharSequence> t = new TreeSet<CharSequence>(new MyComparator());
		t.add("abc");
		t.add("ght");
		t.add("zcd");
		t.add(new StringBuffer("abd"));
		t.add(new StringBuffer("acd"));
		t.add("adgef");
		t.add("fdsd");
		t.add("adhfd");
		t.add("adj");
		System.out.println(" the values are : " +t);
		
		@SuppressWarnings("rawtypes")
		TreeSet<Comparable> t1 = new TreeSet<Comparable>(new MyComparator());
		t1.add(543);
		t1.add(5434);
		t1.add(53.4);
		t1.add(53.3f);
		t1.add('a');
		t1.add(543);
		t1.add(73);
		t1.add("abc");
		t1.add('a'+50);
		t1.add(97);
		t1.add(1253);
		t1.add(657);
		t1.add(676);
		t1.add(654);
		
		System.out.println(" the values are : " +t1);
	}

}
