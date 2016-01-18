package com.core.java.Operators;

public class ThisDemo {
	
		int a;
		int b;
		 
		 public void setData(int a ,int b){
		  this.a = a;
		  this.b = b;
		 }
		 public void showData(){
		   System.out.println("Value of A ="+a);
		   System.out.println("Value of B ="+b);
		 }
		 public static void main(String args[]){
		   ThisDemo obj = new ThisDemo();
		   obj.setData(2,3);
		   obj.showData();
		   ThisDemo obj1 = new ThisDemo();
		   obj1.setData(3,5);
		   obj1.showData();
		 }
		}

