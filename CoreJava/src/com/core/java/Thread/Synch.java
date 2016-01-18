package com.core.java.Thread;

//File Name : Callme.java
//This program uses a synchronized block.
class Callme {
	void call(String msg) {
		
		System.out.print("[" + msg);
		try {
			//for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				//System.out.print("[" + msg);
			//}		
			
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

// File Name : Caller.java
class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;

	public Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	// synchronize calls to call()
	public void run() {
		synchronized (target) { // synchronized block
			target.call(msg);
		}
	}
}

// File Name : Synch.java
public class Synch {
	public static void main(String args[]) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");

		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
