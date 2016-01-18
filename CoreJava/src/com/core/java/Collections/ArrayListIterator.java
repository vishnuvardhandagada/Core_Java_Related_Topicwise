package com.core.java.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

// to remove the comments in line no:22 we will get  

public class ArrayListIterator {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ListIterator l = a.listIterator();
		//l.remove();
		//System.out.println(l.previous());
		while(l.hasNext()){
			Object o = l.next();
			System.out.println(o);
		}

	}

}
