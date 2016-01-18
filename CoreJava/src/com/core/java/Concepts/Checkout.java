package com.core.java.Concepts;

class Rectangle{
	int x, y, width, height;

	public Rectangle(int i, int j, int k, int l) {
		// TODO Auto-generated constructor stub
		x = i;
		y = j;
		width = k;
		height = l;
	}
	
}

public class Checkout {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		Points blank = new Points(5, 8);
		Rectangle rect = new Rectangle(0, 2, 6, 4);
		Points center = findCenter(rect);
		double dist = distance(center, blank);
		System.out.println(dist);
		
		
	}
	
	public static double distance(Points p1, Points p2) {
		int dx = p1.x - p2.x;
		int dy = p1.y - p2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public static Points findCenter(Rectangle box) {
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2;
		return new Points(x, y);
	}

}
