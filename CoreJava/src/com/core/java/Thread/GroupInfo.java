package com.core.java.Thread;

public class GroupInfo extends Thread {
	public static void main(String args[]) {
		
		Thread t1 = new Thread(); // as no group is specified, it is put into
									// main group
		System.out.println("t1 thread name: " + t1.getName()); // Thread-0
		
		System.out.println("t1 thread group name: " + t1.getThreadGroup()); // main
		
		ThreadGroup group = new ThreadGroup("MyGroup");
		
		System.out.println("Thread group name is " + group.getName()); // MyGroup
		
		System.out.println("Parent group of MyGroup is " + group.getParent()); // main
		
		System.out.println("Thread group priority is " + group.getMaxPriority()); // 10
		// the root group of every user defined thread group is main
		
		System.out.println("\nActive Number of thrads in the group: "+ group.activeCount()); // returns 0 as no active threads are running
		
		Thread t2 = new Thread(group, "MyThread1");
		
		System.out.println("\nt2 name is " + t2.getName()); // MyThread1
		
		System.out.println("t2 belongs to group " + t2.getThreadGroup()); // MyGroup
	} //If a thread is not given a name, by default JVM gives Thread-N( where N is an integer number starting with 0
}