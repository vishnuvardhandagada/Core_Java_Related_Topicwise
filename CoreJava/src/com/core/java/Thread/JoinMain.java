//After completion of main thread then child thread to be excecuted through join condition

package com.core.java.Thread;

class JoinDemo1 extends Thread{
	static Thread mt;
	public void run(){
		try{
			mt.join();
			for (int i = 0; i < 5; i++) {
				System.out.println("this is try block child method");
			
			}
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			for(int i=0;i<5;i++)
				System.out.println("child thread  "+i);
		}
	}
}

public class JoinMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JoinDemo1.mt = Thread.currentThread();
		JoinDemo1 j = new JoinDemo1();
		j.start();
		for(int i=0;i<5;i++){
			Thread.sleep(1000);
			System.out.println("main thread  "+i);
	
		}
	}

}
