package com.core.java.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap map = new HashMap();
		map.put(10, 10.2589);
		map.put(13, ' ');
		//map.put("Sreeja", null);
		map.put("Vishnu", "Reddy");
		System.out.println(map);
		Set s = map.keySet();
		Collection c = map.values();
		System.out.println("Set keys are : "+s);
		System.out.println("Collection values are : "+c);
		Set s1 = map.entrySet();
		System.out.println("set contains map<k,v> are :" +s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+ " : " +m.getValue());
			if(m.getValue().equals("Reddy"))
				m.setValue("D");
		}
		System.out.println("new Map<k,v> are : "+map);
		System.out.println(map.put("Vishnu", "Vardhan"));
		map.put(null, "Vishnu");
		map.put(null, "Reddy");
		map.put(" ", "Vishnu");
		map.put("Sreeja", null);
		System.out.println("Map<k,v> are :"+map);
		System.out.println(map.containsKey(null));
		System.out.println(map.containsValue(null));
		System.out.println(map.containsKey("Vishnu"));
			
		
		

	}

}
