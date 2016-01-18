package com.core.java.GarbageCollection;

public class CallFinalize {

	/**
	 * @param args
	 */
	
	static CallFinalize c;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CallFinalize c1 = new CallFinalize();
		System.out.println("C1 HashCode is: "+c1.hashCode());
		
		c1=null;
		System.gc();
		Thread.sleep(5000);
		
		System.out.println("c HashCode is :"+c.hashCode());
		c=null;
		System.gc();
		
		Thread.sleep(5000);
		System.out.println("End of main");
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize method is called");
		c=this;
	}

}
