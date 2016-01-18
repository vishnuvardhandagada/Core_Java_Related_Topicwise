package com.core.java.Interview;

import java.util.Scanner;

public class  StringOppositeCase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given string");
        String input = sc.nextLine();
        
        System.out.println("Given Input ::: " + input);
        
        StringBuilder strBuilder = new StringBuilder(input);
        
        for (int i = 0; i < strBuilder.length(); i++) {
            
            char c = strBuilder.charAt(i);
            
            if (Character.isUpperCase(c)) {
                
                strBuilder.setCharAt(i, Character.toLowerCase(c));
            } else {
                strBuilder.setCharAt(i, Character.toUpperCase(c));
            }
 
        }
        System.out.println("Opposite Case::: " + strBuilder);
 
    }

}
