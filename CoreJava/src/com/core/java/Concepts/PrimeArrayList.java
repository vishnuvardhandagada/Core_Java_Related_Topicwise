package com.core.java.Concepts;

import java.util.ArrayList;

public class PrimeArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeDemo(50);

	}

	private static void primeDemo(int no) {
		// TODO Auto-generated method stub
		ArrayList<Boolean> pri = new ArrayList<Boolean>(no);
		
		for(int i=0; i<no; i++){
			pri.add(i, true);
		}
		
		for(int i=2; i<pri.size(); i++){
			if(pri.get(i)){
				for(int j=i+i; j<pri.size(); j+=i){
					pri.add(j, false);
				}
			}
		}
		
		for(int i=0; i<pri.size(); i++){
			if(pri.get(i)){
				System.out.println(i);
			}
		}
	}

}
