//reverse of a string is word by word and reverse of a string is char by char

package com.core.java.ObjectClass.string;

public class StringReverse{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String s = "This is vishnu vardhan reddy";
		String[] s1=s.split(" ");
		@SuppressWarnings("unused")
		//String[] s2=s1;
	
		// reverse of a string word by word----------------------------------------------------------Approach 1
		//int t = s2.compareTo(s1);
    	int n = s1.length;
		for(int i=n-1;i>=0;i--)
			System.out.print("  "+s1[i]);
		
		
		System.out.println();
		// reverse of a string in char by char--------------------------------------------------------Approach 2
		String str = "India is a country";
		char[] ch = str.toCharArray();
		char[] ch1 = new char[str.length()];
		for (int i = ch.length-1,j=0; i >=0 ; i--,j++) {
			ch1[j] = ch[i];
					
		}
		System.out.println(new String(ch1));
		
		
		// reverse of a string is using StringBuffer		---------------------------------------------Approach 3
		String str1 = "String is reverse by using StringBuffer";
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse().toString();
		System.out.println(sb);
		
		
		
		//recursive method to reverse String in Java-----------------------------------------------------Approach 4
		
		String revstr = "this is reverse of a code to be written";
        revstr = reverseRecursively(revstr);
        System.out.println("Reverse String in Java using Recursion : " + revstr);


		

	}
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
	
}