package com.core.java.Concepts;

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo(50);

	}

	private static void PrimeNo(int no) {
		// TODO Auto-generated method stub
		boolean pri[] = new boolean[no];
 		for(int i=0;i<no;i++){
			pri[i] = true;
		}
 		for(int i=2; i<pri.length; i++)
 		{
 			if(pri[i]){
 				for(int j=i+i; j<pri.length; j+=i){
 					pri[j]=false;
 				}
 			}
 		}
 		
 		for(int i=2;i<pri.length;i++){
 			if(pri[i]){
 				System.out.println(i);
 			}
 		}
 			
		
	}

}
