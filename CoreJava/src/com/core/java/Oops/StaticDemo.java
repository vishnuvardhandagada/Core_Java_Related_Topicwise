//Static variables will be check for every objects

package com.core.java.Oops;

class Demo{
	static int i=10;
	public static void m1(){
		System.out.println(" this m1() : " +i);
	}
}

public class StaticDemo {

	/**
	 * @param args
	 */
	//int i = 10;
	static int x = 99;
	int y=88;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo sd = new StaticDemo();
		StaticDemo sd1 = new StaticDemo();
		sd.x = 999;
		sd.y = 888;
		//Demo d = new Demo();
		//d.m1();
		
		System.out.println("The first object x & y values are  : "+sd.x +" "+sd.y);
		System.out.println("The second object x & y values are  : "+sd1.x +" "+sd1.y);

	}
	/*public void m1(){
		System.out.println(" this m1()"  + i);
	}
*/
}
