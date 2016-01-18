package com.core.java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class HashMapIterator {

	/**
	 * @param args
	 */
	int id;
	String name;
	int marks;
	HashMapIterator(int id,String name, int marks)
	{
		this.id=id;
		this.name= name;
		this.marks=marks;
	}
	public HashMapIterator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapIterator hmi1 = new HashMapIterator(101, "abc" , 55);
		HashMapIterator hmi2 = new HashMapIterator(102, "abf" , 65);
		HashMapIterator hmi3 = new HashMapIterator(103, "abs" , 75);
		HashMapIterator hmi4 = new HashMapIterator(104, "abd" , 85);
		
		HashMap<String, Object> h = new HashMap<String, Object>();
		h.put("c", hmi1);
		h.put("b", hmi2);
		h.put("a", hmi3);
		h.put("d", hmi4);
		
		/*ArrayList a = new ArrayList();*/
		
		//Set s = h.keySet();
		Set t = h.keySet();
		Iterator itr = t.iterator();
		
		TreeSet ts = new TreeSet();
		while(itr.hasNext()){
			//String str = (String)itr.next();
			ts.add(itr.next());
			
		}
		System.out.println("Prints the set key values : "+ts);
		
		//itr = ts.descendingIterator();           //Returns an iterator over the elements in this set in descending order.
		itr = ts.iterator();                       //Returns an iterator over the elements in this set in ascending order.
		System.out.println("Prints the Map values : ");
		
		while(itr.hasNext()){
			String str = (String)itr.next();
			HashMapIterator hm = (HashMapIterator)h.get(str);
			
			System.out.println(str + "  "+ hm.id+"  "+hm.name+"  "+hm.marks);			
			
		}
		
		//System.out.println(ts);
		
		
		//System.out.println(t);
		Iterator itr1 = t.iterator();
		
		
		
		/*while(itr.hasNext()){
			//String str = (String)itr.next();
			System.out.println(itr.next());
		}*/
		/*Collection c = h.values();
		Iterator it = c.iterator();
		while(it.hasNext()){
			HashMapIterator str = (HashMapIterator)it.next();
			System.out.println(str.id+"   "+str.name+"   "+str.marks);
		}*/
		//System.out.println("the values of hashmap is : " +s);
		
		
		
		
		

	}

}
