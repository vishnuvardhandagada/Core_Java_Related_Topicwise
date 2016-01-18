//how thread is flowing in this programe and if you put comment on t.wait() method
//what will happen what output is existed


package com.core.java.Thread;

public class ThreadDemo implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{  
		ThreadDemo d = new ThreadDemo();
          Thread t= new Thread(d);
          
          t.start();
          synchronized (t) {
        	  t.wait();
              System.out.println(t.currentThread().getName()+"  main");
              System.out.println(Thread.currentThread().getName() + " 2nd time main");
              t.interrupt();
              for(int i=0;i<6;i++)
            	  System.out.println("main mathod");
            }	
		}
         
        catch(Exception e){
        System.err.println("this is exception");
        }
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{System.out.println(Thread.currentThread().getName()+" child");
		synchronized (this) {
			this.notify();
			for(int i=0;i<6;i++){
			  Thread.sleep(1000);
	      	  System.out.println("child mathod"+i);
			}
		}
		
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("interrupted Exceptons");
		}
	}

}