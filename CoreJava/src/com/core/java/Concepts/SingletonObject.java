package com.core.java.Concepts;

import java.io.ObjectStreamException;

public class SingletonObject {

	/**
	 * @param args
	 */
	
	private static SingletonObject s;
	static int count;
	
	public SingletonObject(){
		
	}
	
public static SingletonObject getMethod()throws Exception{
		
		if(s == null){
			count++;
			return s = new SingletonObject();
		}
			
		else if(count<6){
			count++;
			return s = new SingletonObject();
		}
		else{
			throw new Exception();
		}
		
			
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		SingletonObject s1 = SingletonObject.getMethod();
		SingletonObject s2 = SingletonObject.getMethod();
		SingletonObject s3 = SingletonObject.getMethod();
		SingletonObject s4 = SingletonObject.getMethod();
		SingletonObject s5 = SingletonObject.getMethod();
		SingletonObject s6 = SingletonObject.getMethod();
		SingletonObject s7 = SingletonObject.getMethod();
		

	}

}
