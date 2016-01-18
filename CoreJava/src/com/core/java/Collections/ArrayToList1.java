package com.core.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayToList1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		List<String> assetList = new ArrayList<String>();
		String[] asset = {"equity", "stocks", "gold", "foriegn exchange", "fixed income", "futures",
		"options"};
		Collections.addAll(assetList, asset);
		System.out.println(" The converting list values are : " +assetList);
		for(String l1 : assetList){
			System.out.println(l1);
		}
		

	}

}
