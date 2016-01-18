//when ever you press the 'enter' the key word then it will be stop the running prog


package com.core.java.Thread;

import java.io.IOException;

class MyThread extends Thread{
	boolean stop = false;
	public void run()
	{
		for(int i=1;i<=100000;i++){
			System.out.println("Child thread" +i);
			if(stop)
				return;
		}
			
	}
}
public class StopThread {
	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
			MyThread m = new MyThread();
			Thread t = new Thread(m);
			m.start();
			
			
			System.out.println(" please press the 'enter' keyword : ");
			System.in.read();
			System.out.println("main thread is executing");
		    m.stop = true;
		    

		}
		catch (IOException e) {
			// TODO: handle exception
			System.err.print("this is ioexception");
			
			
			
		}
		
	}

}