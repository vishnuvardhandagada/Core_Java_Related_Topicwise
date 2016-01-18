package com.core.java.Thread;

public class ThreadExtends extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadExtends t = new ThreadExtends();
		t.start();
		System.out.println("This is main class method");

	}
	
	public void run(){
		System.out.println("This is thread class method");
	}

}
