package com.core.java.Collections;

import java.util.ArrayList;

public class ArrayListToArray {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList assetTradingList = new ArrayList();
		assetTradingList.add("Stocks trading");
		assetTradingList.add("futures and option trading");
		assetTradingList.add("electronic trading");
		assetTradingList.add("forex trading");
		assetTradingList.add("gold trading");
		assetTradingList.add("fixed income bond trading");
		String [] assetTradingArray = new String[assetTradingList.size()];
		assetTradingArray.toArray(assetTradingList);

	}

}
