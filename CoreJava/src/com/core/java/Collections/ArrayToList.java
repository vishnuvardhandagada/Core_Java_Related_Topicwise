package com.core.java.Collections;


import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] asset = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures",
		"options"};
		List assetList = Arrays.asList(asset);
		System.out.println( "The list elements are  : "+assetList);

	}

}
