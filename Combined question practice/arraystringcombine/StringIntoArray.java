package com.arraystringcombine;

public class StringIntoArray {
	public static void main(String[] args) {
		String str = "payal chavan";
		char array[] = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != ' ') {

				System.out.println(array[i]);
			}
		}
	}
}
