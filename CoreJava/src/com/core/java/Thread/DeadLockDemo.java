package com.core.java.Thread;



class A
{
	public synchronized void foo(B b)
	{
		System.out.println("Thread1 starts executing of foo method");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		}
		System.out.println("Thread1 trying to call b's last() method");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("inside A, this is last() method");
	}
}
////////////////////////////////////////////////////////////////////////

class B
{
	public synchronized void bar(A a)
	{
		System.out.println("thread2 starts executing of bar() method");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		}
		System.out.println("thread2 trying to call a's last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("this is b's last method");
	}
}
/////////////////////////////////////////////////////////////

class DeadLockDemo implements Runnable
{
	A a=new A();
	B b=new B();
	DeadLockDemo()
	{
		Thread t=new Thread(this);
		t.start();
		a.foo(b);
	}
	public void run()
	{
		b.bar(a);
	}
	public static void main(String args[])
	{
		new DeadLockDemo();
	}
}

