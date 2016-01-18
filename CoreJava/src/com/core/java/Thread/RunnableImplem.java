package com.core.java.Thread;

public class RunnableImplem implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableImplem r = new RunnableImplem();
		Thread t = new Thread(r);
		t.start();
		System.out.println("This is main method");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" This is implements Runnable method");
		
	}

}
