package com.core.java.Interview;

import java.util.Scanner;

public class StringPalindrome
{

    public static void main(String args[])
    {
   
    // Create a Scanner object

    Scanner s=new Scanner(System.in);

    System.out.println("Enter the string");

    // Read the data

    String st1=s.nextLine();
    
    String rev =""; 
    
    int num = st1.length();
    for (int i = num-1; i >= 0; i--) {
    	rev = rev + st1.charAt(i);
    }
    
    if(rev.equals(st1))
    	System.out.println("The given string is palindrome");
    else
    	System.out.println("The given string is not palindrome");
		
	}
    

    /*// Create StringBuffer obj for st1
    StringBuffer sb=new StringBuffer(st1);

    // Reverse the letters
    sb.reverse();

        // Check & Print if palindrome
        if(st1.equals(sb.toString()))
        System.out.println("Palindrome String");

    }*/

}