package com.stringpractice;

public class PrintingNameInStarPattern {
	public static void main(String[] args) {
		String str = "Payalpatil";

		int start = 0;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(str.charAt(start));
				start++;

			}
			System.out.println(" ");

		}
	}

}
