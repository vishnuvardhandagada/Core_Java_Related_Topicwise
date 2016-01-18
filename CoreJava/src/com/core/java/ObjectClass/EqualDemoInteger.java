package com.core.java.ObjectClass;

public class EqualDemoInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i1 = 10;
		Integer i2 = 10;//new Integer(10);
		Integer i3 = 1500;
		Integer i4 = 1600;
		if(i1==i2)
		{
			System.out.println("ok");
		}
		if(i3==i4)
		{
			System.out.println("whah");
		}
		if(i1.equals(i2))
		{
			System.out.println("oh");
		}
		if(i3.equals(i4))
		{
			System.out.println("find");
		}
		
		String s1 = "Vishnu";
		String s2 = new String("Vishnu");
		if(s1==s2)
			System.out.println("both are equal in reference comparision");
		if(s1.equals(s2))
			System.out.println("both are equal in content comparision");
		
	}

}
