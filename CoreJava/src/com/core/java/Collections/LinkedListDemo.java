package com.core.java.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n values to add LinkedList ");
		int n = sc.nextInt();
		Integer[] k = new Integer[n];
		System.out.println("enter the "+n+" values in the LinkedList");
		for (int i = 0; i < n; i++) {
			
			k[i] = sc.nextInt();
			ll.add(k[i]);
			
		}
		System.out.println("LinkedList values are : "+ll);
		System.out.println("LinkedList size is :"+ll.size());
		Iterator itr = ll.iterator();
		int s = 0;
		while(itr.hasNext()){
			Object obj =  itr.next();
			Integer io = (Integer)obj;
			int x = io.intValue();
			s = s + x; 
		}
		
		System.out.println("Sum of the LinkedList values are :" +s);
		if(n%2==0){
			int p = n/2;
			int m = p-1;
			System.out.println("The middle elementst of LinkedList are "+k[m]+" : "+k[p]);
		}
		else{
			System.out.println("The middle elementst of LinkedList is : "+k[n/2]);
		}
		
		 

	}

}
