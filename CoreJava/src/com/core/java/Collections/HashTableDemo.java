package com.core.java.Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht = new Hashtable();
		
		Map m = new HashMap();
		m.put("jai", "sai");
		//m.put(null, "hello");
		//m.put("value", null);
		
		
		ht.put("vishnu", "reddy");
		ht.put("ram", "raj");
		ht.put("hai","bye");
		ht.putAll(m);
		
		System.out.println("Hashtable <k,v> are : "+ht);
		
		

	}

}
