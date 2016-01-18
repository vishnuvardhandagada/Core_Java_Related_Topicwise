/*Two properways to requesting JVM to run gc()
1.System.gc(); -------------------------(Correct)----Recomended
2.Runtime.gc();
3.(new Runtime()).gc();
4.Runtime.getRuntime().gc();------------(Correct)

Note : gc() is a static method in System class where as it is instance method Runtime class
 	   It is recomended to use System class gc() over Runtime class gc()
*/

package com.core.java.GarbageCollection;

import java.util.Date;


public class RuntimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory : "+r.totalMemory());
		System.out.println("Free Memory Available :"+r.freeMemory());
		
		for (int i = 0; i < 100000; i++) {
			Date d = new Date();
			d=null;
		}
		System.out.println("Free Memory Available before to call gc() :"+r.freeMemory());
		r.gc();
		System.out.println("Free Memory Available after to call gc()  :"+r.freeMemory());

	}

}
