
package com.core.java.Collections;

import java.awt.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

class MyCompatator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		return o2.hashCode()-o1.hashCode();
	}
	
}


public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		h.put("ramu", 111);
		h.put("anu", 114);
		h.put("balu", 116);
		h.put("krishna", 112);
		h.put("manu", 119);
		h.put("dolly", 113);
		//System.out.println("the hashmap key, values are  :" +h);
		
		
		/*Set s = h.entrySet();
		System.out.println(" the set entry's are : " +s);*/
		
		/*TreeSet t = new TreeSet();
		t.add(s);
		System.out.println(" the sorting elements are : "+t);
		*/
		
		Set s = h.keySet();
		//System.out.println(" the set keys  are : "+s);
		
		
		TreeSet t = new TreeSet(new MyCompatator());
		t.add(s);
		System.out.println(" the TreeSet sorting elements are : "+t);
		
		
		
		
		
		Set s1 = h.keySet();
		Iterator itr = s1.iterator();
		TreeSet ts = new TreeSet();
		while(itr.hasNext()){
			ts.add(itr.next());
		}
		System.out.println("the key  are : "+ts);
		
		itr = ts.descendingIterator();
		while(itr.hasNext()){
			String str = (String)itr.next();
			
			
			System.out.println("the key are : "+str +"   : the values are : "+h.get(str));
			
		}
		
		
		
		/*Set s2 = (Set) h.values();
		System.out.println(" the set values are : "+s2);*/
		
		
		/*Collection<Integer> c = (Collection)h.values();
		System.out.println( " the collection values are : "+c);
		
		
		Iterator itr = c.iterator() ;
		while(itr.hasNext()){
			Object o = (Object)itr.next();
			System.out.println(o);
		}
		*/

	}

}
