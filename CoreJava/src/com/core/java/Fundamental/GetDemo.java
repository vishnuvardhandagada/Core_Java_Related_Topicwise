package com.core.java.Fundamental;


class Demo1
{
	private final int x,y;
	public Demo1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
}


public class GetDemo {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1(10,20);
		int x = d.getX();
		int y = d.getY();
		System.out.println("X : "+x+ " : Y : "+y);

	}

}
