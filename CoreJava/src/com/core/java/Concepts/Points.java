package com.core.java.Concepts;

public class Points {
	
	int x, y;

	public Points(int i, int j) {
		// TODO Auto-generated constructor stub
		x  = i;
		y = j;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		Points blank = new Points(1, 2);
		System.out.println(riddle(x, blank));
		System.out.println(x);
		System.out.println(blank.x);
		System.out.println(blank.y);	

	}
	public static int riddle(int x, Points p)
	{
	x = x + 7;
	return x + p.x + p.y;
	}

}
