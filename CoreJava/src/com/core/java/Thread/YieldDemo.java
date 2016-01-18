package com.core.java.Thread;

class DemoThread extends Thread{
	public void run(){
		
		for(int i=0; i<10;i++){
			Thread.yield();
			System.out.println("This is child thread" +i);
		}
	}
}
public class YieldDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread m = new DemoThread();
		
		m.start();
		for(int i=0;i<10;i++){
			Thread.yield();
			System.out.println("this is main thread" +i);

		}
			
	}

}
