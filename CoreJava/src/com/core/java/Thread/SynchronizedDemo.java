package com.core.java.Thread;

class ThreadDemo1 extends Thread
{
	public void run(){
		
			for(int i=1;i<5;i++){
				
				System.out.print(Thread.currentThread().getName()+" ");
			}
		System.out.println();
		
	}
	
}
public class SynchronizedDemo extends Thread{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadDemo1 th = new ThreadDemo1();
		ThreadDemo1 th1 = new ThreadDemo1();
		Thread t1 = new Thread(th);
		t1.setName("vishnu");
		t1.start();
		Thread t2 = new Thread(th,"laxman");
		
		t2.start();
		Thread t3 = new Thread(th1,"anil");
		t3.start();
		Thread t4 = new Thread(th1,"bhaskar");
		t4.start();
		//SynchronizedDemo.m1();
		
		SynchronizedDemo.m1();
		new SynchronizedDemo().m2();
	
		

	}
	
	
	public static synchronized void m1() throws InterruptedException{
		int a=20 , b=30;
		int c;
		Thread.sleep(4000);
		for (int i = 0; i < 5; i++) {
			System.out.print("sum m1 : "+(c=a+b)+" ");
		}
		System.out.println();
		
	}
	public  synchronized void m2() throws InterruptedException{
		int a=20 , b=30;
		int c;
		Thread.sleep(4000);
		for (int i = 0; i < 5; i++) {
			System.out.print("sum m2 : "+(c=a+b)+" ");
		}
		System.out.println();
		
	}

}
