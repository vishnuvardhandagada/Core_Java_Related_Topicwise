package com.core.java.Thread;

public class ThreadInfo extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Current Thread Name : " +Thread.currentThread().getName());
		System.out.println("Current Thread Priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("Afetr Set Current Thread Priority : "+Thread.currentThread().getPriority());
		
		//Thread.currentThread().setName("Thread Main Vishnu");
		System.out.println("Afetr Set Current Thread Name : " +Thread.currentThread().getName());
		
		
		
		ThreadInfo t = new ThreadInfo();
		System.out.println("Current class Name : "+t.getClass());
		System.out.println("Current class Thread Name : "+t.getName());
		Thread.currentThread().setName("Thread Main");
		System.out.println("After Set the Current Class Thread Name : "+t.currentThread().getName());
		
		
		System.out.println("Current Thread class Priority : "+t.getPriority());
		t.setPriority(9);
		System.out.println("Afetr Set Current Thread class Priority : "+t.getPriority());*/
		
		Thread t1 = new Thread( ) ;       // create a thread with Thread class

		System.out.println( "Deault t1 Name: " + t1.getName( ) ) ;  // prints Thread-0
		t1.setName( "Hello Thread" ) ;
		System.out.println("t1 Name after assigning: "+ t1.getName( )); // Hello Thread
		System.out.println( "Default Priority of t1: " + t1.getPriority( ) ) ; // prints 5
		t1.setPriority( Thread.MAX_PRIORITY ) ;
		System.out.println( "Priority of t1 after setting: " + t1.getPriority( ) ) ; // prints 10
		System.out.println( "Default thread group of t1: " + t1.getThreadGroup( ) ) ;// prints main
		System.out.println( "Default t1 isDaemon( ): "  + t1.isDaemon( ) ) ;        // false
		t1.setDaemon( true ) ;
		System.out.println( "After setting t1 isDaemon( ): "  + t1.isDaemon( ) ) ;  // true
		System.out.println( "t1.isAlive( ): " + t1.isAlive( ) ) ; // prints false as start( ) is not called still
		t1.start();
		System.out.println( "t1.isAlive( ): " + t1.isAlive( ) ) ; // prints true as start( ) is calling
		System.out.println( "t1.isInterrupted( ): " + t1.isInterrupted( ) ) ;  // false
	}
		
		

	}


