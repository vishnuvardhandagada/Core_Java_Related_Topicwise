package com.core.java.GarbageCollection;

public class FinalizeException {

	
	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FinalizeException f = new FinalizeException();
		
		f.m1();
		//System.gc();
		f=null;
		//f.finalize();
		//System.gc();
		System.out.println("This is main method");
		System.gc();
		

	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("this is finalize");
	}
	public void m1(){
		System.out.println("This is m1 method ");
	}

}
