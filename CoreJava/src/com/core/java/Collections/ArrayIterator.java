//ConcurrentModificationException will be thrown when ever modifing the list object after adding to the Iterator object

package com.core.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		@SuppressWarnings("rawtypes")
		Iterator itr = al.iterator();
		al.add(50);
		System.out.println("The ArrayList values are : "+al);
		
		while(itr.hasNext())
		{
			Object o = itr.next();
			System.out.println("The Object class values are : "+o);
		

			
		}

	}

}
