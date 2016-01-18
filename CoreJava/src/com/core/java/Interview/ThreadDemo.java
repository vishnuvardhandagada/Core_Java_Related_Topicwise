package com.core.java.Interview;

public class ThreadDemo extends Thread {

	/**
	 * @param args
	 */
	int i=1;
	public void run(){
		System.out.println("this is run method : "+i++);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ThreadDemo());
		t.run();
		t.run();
		t.start();

	}

}
