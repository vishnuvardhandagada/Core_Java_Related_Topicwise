package com.core.java.Thread;

class Aa
{
	public synchronized void foo(Bb b)
	{
		System.out.println("Thread1 starts executing of foo method");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println("Thread1 trying to call b's last() method");
		}
	}

	public synchronized void last()
	{
		System.out.println("inside A, this is last() method");
	}
}
class Bb
{
	public synchronized void bar(Aa a)
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
public class DeadLockSync implements Runnable
{
	Aa a=new Aa();
	Bb b=new Bb();
	DeadLockSync()
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
		new DeadLockSync();
	}
}
