package com.core.java.Thread;

public class ThreadSync extends Thread{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public  void method1() throws InterruptedException{
		Thread.sleep(2000);
		for (int i = 0; i < 5; i++) {
			System.out.print("Method1  ");
		}	
		System.out.println();
		
	}
	

	public  void method2() throws InterruptedException{
		Thread.sleep(4000);
		for (int i = 0; i < 5; i++) {
			System.out.print("Method2  ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadSync ts1 = new ThreadSync();
		ThreadSync ts2 = new ThreadSync();
		ThreadSync ts3 = new ThreadSync();
		ThreadSync ts4 = new ThreadSync();
		
		
		Thread t1 = new Thread(ts1);
		Thread t2 = new Thread(ts2);
		
		/*
		 *
		ts2.method2();
		ts1.method1();
		*/
		
		
		ts1.method1();
		ts2.method2();
		ts3.method3();
		ts4.method4();
		

	}
	
	public static  void method3() throws InterruptedException{
		Thread.sleep(3000);
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Method3  ");
			
		}
		System.out.println();
	}
	
	public static void method4() throws InterruptedException{
		Thread.sleep(1000);
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Method4  ");
			
		}
		System.out.println();
	}

}
