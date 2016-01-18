package com.core.java.Fundamental;

public class InstanceMethod {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		InstanceMethod i = new InstanceMethod();
		i.instance();
		synchronized (i) {
			i.wait(10000);
		}
		
		staticMethod();

	}

	private void instance() {
		// TODO Auto-generated method stub
		System.out.println("This is instance method");
		String s[] = new String[2];
		
		//main(s);
		//staticMethod();
		
	}
	public static void staticMethod(){
		System.out.println("This is static method");
		InstanceMethod m = new InstanceMethod();
		m.instance();
	}

}
