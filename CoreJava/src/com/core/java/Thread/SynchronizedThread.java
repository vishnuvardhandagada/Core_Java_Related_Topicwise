package com.core.java.Thread;

class Display{
	/*public synchronized void wish(String name){
		for(int i = 0;i<5; i++){
			System.out.print(name+" ");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
			}
		}
		System.out.println();
	}*/
	public synchronized void wish(String name){
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie)
		{
		}
		System.out.println(name);
	}
	
}

class MyClass extends Thread{
	Display d;
	String name;
	
	MyClass(Display d, String name){
		this.d = d;
		this.name=name;
	}
	
	public void run(){
		d.wish(name);
	}
	
}

public class SynchronizedThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d = new Display();
		Display d2 = new Display();
		MyClass m1 = new MyClass(d, "Vishnu");
		MyClass m2 = new MyClass(d2, "Sreeja");
		
		m1.start();
		m1.start();

	}

}
