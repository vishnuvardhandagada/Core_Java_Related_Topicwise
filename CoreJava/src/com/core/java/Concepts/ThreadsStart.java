package com.core.java.Concepts;

public class ThreadsStart extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsStart t = new ThreadsStart();
		t.start();
		System.out.println("Start1 is excecuting");
		t.start();
		System.out.println("Start2 is excecuting");
		
		

	}
	public void run(){
		System.out.println("Run method is excecuting");
	}

}
