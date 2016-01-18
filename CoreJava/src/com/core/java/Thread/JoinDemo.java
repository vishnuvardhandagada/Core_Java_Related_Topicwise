package com.core.java.Thread;

class MyJoin extends Thread{
	public void run(){
		try{
		for(int i=0;i<5;i++)
		{
			Thread.sleep(1000);
			System.out.println("This is child "+i);
		}
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("interrupted exception in child");
		}
	}
}
public class JoinDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJoin m = new MyJoin();
		Thread t = new Thread(m);
		t.start();
		//t.interrupt();
		
		try {
			t.join();
			
			
			for(int i=0;i<5;i++)
				System.out.println( "main method thread");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
