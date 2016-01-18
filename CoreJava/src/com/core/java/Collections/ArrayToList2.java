package com.core.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] asset = {"equity", "stocks", "gold", "foriegn exchange", "fixed income", "futures",
				"options"};
		ArrayList newAssetList = new ArrayList();
		newAssetList.addAll(Arrays.asList(asset));
		System.out.println("The ArrayList Values are : "+newAssetList);

	}

}
