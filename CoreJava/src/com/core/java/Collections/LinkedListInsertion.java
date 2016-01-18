package com.core.java.Collections;

import java.util.LinkedList;

public class LinkedListInsertion {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		LinkedList ll = new LinkedList();
		
		ll.addLast("Raju");
		ll.add("Vishnu");
		ll.add("Sreeja");
		ll.add(0,"Manu");
		ll.add(50);
		System.out.println(ll.removeLast());
		ll.addFirst("Ravi");
		ll.add(45.25);
		ll.add(null);
		
		ll.add(0,"Malli");
		System.out.println(ll);
		

	}

}
