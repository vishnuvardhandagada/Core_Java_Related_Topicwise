package com.core.java.GarbageCollection;

public class StringClassFinalize {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		/*String s = new String();
		s = null;
		System.gc();
		System.out.println( "Main method ");*/
		
		StringClassFinalize s = new StringClassFinalize();
		s.finalize();
		s.finalize();
		s = null;
		System.gc();
		System.out.println("End of Main ");

	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("This is finalize method");
	}

}
