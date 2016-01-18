//this ia a count the number of letters will be repeated in a given string
package com.core.java.Concepts;

public class CharCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruit = "this ia a count the number of letters will be repeated in a given string";
		int length = fruit.length();
		int count = 0;
		int index = 0;
		while (index < length) {
			if (fruit.charAt(index) == 'i') {
				count = count + 1;
			}
			index = index + 1;
		}
		System.out.println(count);

	}

}
