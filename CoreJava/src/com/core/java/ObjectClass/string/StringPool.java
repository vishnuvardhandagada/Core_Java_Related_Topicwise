package com.core.java.ObjectClass.string;

import java.util.HashMap;

public class StringPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("vishnu");
		String s1 = "vishnu";
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s.intern());
		String str = new String("vardhan");
		System.out.println(s.intern());
		
		System.out.println(str.intern());
		
		String st = new String();
		System.out.println(st.intern());
		
		
		String ss =new String("Spring");
		s.concat("winter");
		String ss1 = new String("summer");
		String ss2  = ss1.concat("fall");
		System.out.println(ss);
		System.out.println(ss1);
		System.out.println(ss2);
		
		HashMap h = new HashMap();
		h.put(null, "vishnu");
		h.put(11, "vardhan");
		System.out.println(h.get(11));

	}

}
