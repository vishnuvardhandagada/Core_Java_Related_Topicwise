// count the no: of letters are repeated in a given String and reverse of string in word by word and char by char

package com.core.java.ObjectClass.string;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class StringCount {

	/**
	 * @param args
	 */
	public static void reverse(String s){
		String res="";
		
		//returning total string values
		char[] rev=new char[s.length()];
		for (int i = s.length()-1,j=0; i >=0; i--,j++) {
			rev[j]=s.charAt(i);
			
		}
		System.out.println(rev);
		
		
		//word returning the String
		String[] str=s.split(" ");
		for (int i = str.length-1; i >=0; i--) {
			res+=" "+str[i];
		}
		System.out.println(res);
		
		//return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="this is a string count count the no: of string in the existing string";
        String[] words=str1.split(" ");
        Map<String,Integer> m =new TreeMap<String,Integer>();          //LinkedHashMap(or)HashMap
       
        for (int i = 0; i < words.length; i++) {
        	 int count=0;
        	String s=words[i];
        	if(m.containsKey(s.toLowerCase())){
        		Integer val=(Integer)m.get(s);
        		val++;
        		m.put(s, val);
        	}
        	else
        	{
        		count++;
        		m.put(s, count);
        	}
			
		}
        System.out.println(m);
        
        /* String s1 = "Vishnu";
        System.out.println(s1.toLowerCase());
        String s1="kiran";
        String s2="kiran1";
        String s3="kiran2";
        m.put("vishnu", 70);
        m.put(s1, 80);
        m.put(s2, 90);
        m.put(s3, 60);
        System.out.println(m.get(s1));*/
        
        
        
        reverse("vishnu anatapur");
	}
	

}
