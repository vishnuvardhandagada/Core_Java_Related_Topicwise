package com.core.java.Collections;

import java.awt.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class SortMapOnValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> unsortMap = new HashMap<String, String>();
		unsortMap.put("2", "B");
		unsortMap.put("1", "A");
		unsortMap.put("4", "D");
		unsortMap.put("3", "B");
		unsortMap.put("7", "C");
		unsortMap.put("5", "z");
		unsortMap.put("6", "b");
		unsortMap.put("8", "a");
		System.out.println("Unsort Map......");
		printMap(unsortMap);
		System.out.println("Sorted Map......");
		@SuppressWarnings("unchecked")
		Map<String, String> sortedMap = sortByComparator(unsortMap);
		printMap(sortedMap);

	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Map sortByComparator(Map unsortMap) {
		LinkedList list = new LinkedList(unsortMap.entrySet());
		// sort list based on comparator
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		// put sorted list into map again
		//LinkedHashMap make sure order in which keys were inserted
		Map sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	public static void printMap(Map<String, String> map){
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey()+ " Value : " + entry.getValue());
		}
	
	}		
		
}
