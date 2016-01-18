package com.core.java.ObjectClass.string;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abac");
		System.out.println("String s : "+s);
		System.out.println("s charAt:"+s.charAt(3));
		System.out.println("s compareTo(abac):"+s.compareTo("abac"));
		System.out.println("s compareTo(Abac):"+s.compareTo("Abac"));
		System.out.println("s compareToIgnoreCase:"+s.compareToIgnoreCase("Abac"));
		System.out.println("s concat:"+s.concat("adaf"));
		System.out.println("After Concatenation :"+s);
		System.out.println("s contains:"+s.contains("ab"));
		System.out.println("s contentEquals:"+s.contentEquals("abacad"));
		System.out.println("s contentEquals:"+s.contentEquals(new StringBuffer("abacadaf")));
		System.out.println("s contentEquals:"+s.contentEquals("abac"));
		System.out.println("s equals:"+s.equals("abac"));
		System.out.println("s equalsIgnoreCase:"+s.equalsIgnoreCase("Abac"));
		System.out.println("s hashCode:"+s.hashCode());
		System.out.println("s value is : "+s);
		System.out.println("s indexOf(2):"+s.indexOf(2));
		String s1 = new String("abac adaf");
		System.out.println("String s1 : "+s);
		System.out.println("s1 indexOf(abac):"+s1.indexOf("abac"));
		System.out.println("s indexOf(1, 3):"+s.indexOf(1, 3));
		System.out.println("s1 indexOf(adaf, 2):"+s1.indexOf("adaf", 2));
		System.out.println("s1 intern:"+s1.intern());
		System.out.println("s lastIndexOf:"+s.lastIndexOf('a'));
		System.out.println("s length:"+s.length());
		System.out.println("s replace:"+s.replace('a', 'm'));
		System.out.println("s replaceAll:"+s.replaceAll("a", "mno"));
		System.out.println("s :" +s);
		System.out.println("s substring(2):"+s.substring(2));
		System.out.println("s substring(2, 4):"+s.substring(2, 4));
		System.out.println("s toCharArray:"+s.toCharArray());
		System.out.println(s1);
		System.out.println("s1 trim: "+s1.trim());
		

	}

}
