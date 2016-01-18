package com.core.java.Concepts;

public class ArmstrongNum {

	/**
	 * @param args
	 */
	
	//153 = 1(cube)+ 5(cube) + 3(cube)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int r = 0, sum =0, temp=n;
		while(n>0){
			r = n%10;
			sum = sum + r * r * r;
			n = n/10;
		}
		
		if(temp == sum)
			System.out.println("this is armstrong number");
		else
			System.out.println("this is not armstrong number");
		
	}

}
