package com.core.java.ObjectClass;

public class EqualsHash {
	private int num;
	private String data;
	
	public EqualsHash(int num,String data){
		this.num = num;
		this.data = data;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		// object must be Test at this point
		EqualsHash test = (EqualsHash) obj;
		return num == test.num && (data == test.data || (data != null && data.equals(test.data)));
	}

	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + num;
		hash = 31 * hash + (null == data ? 0 : data.hashCode());
		return hash;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsHash e = new EqualsHash(2,"vishnu");
		EqualsHash e1 = new EqualsHash(4,"sreeja");
		EqualsHash e2 = new EqualsHash(2,"Vishnu");
		if(e.equals(e1)){
			System.out.println("Both objects e & e1 are equal");
		}
		else if(e.equals(e2)){
			System.out.println("Both objects e & e2 are not equal");
		}
		else{
			System.out.println("Both objects are not equal");
		}
		

	}

	// other methods
}
