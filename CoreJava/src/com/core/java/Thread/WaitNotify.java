package com.core.java.Thread;

class ThreadA extends Thread{
	int total = 0;

	public void run(){
		//int total = 0;
		synchronized (this) {
			System.out.println("This is child Thread is executing");
			for (int i = 0; i < 3; i++) {
				total  = total + i;				
			}
			System.out.println("Child Thread calls the notificatin method to main ");
			this.notify();
		}
	}
}

public class WaitNotify {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadA t = new ThreadA();
		t.start();
		synchronized (t) {
			System.out.println("main method is calling wait method");
			t.wait();
			System.out.println("main method got the notification call");
			System.out.println("the total amount is  : " + t.total);
			
		}
		

	}

}
