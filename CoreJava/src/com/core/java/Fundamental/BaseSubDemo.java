package com.core.java.Fundamental;

class Base {} 

class Sub extends Base {} 

class Sub2 extends Base {}

public class BaseSubDemo{
	
	public static void main(String argv[]){

		Base b=new Base();

		Sub s=(Sub) b;

		}
}

