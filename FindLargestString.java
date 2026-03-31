package com.stringpractice;

public class FindLargestString {

	public static void main(String[] args) {
		String str = "I love SQL queries";
		String word = "";
		String largest = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				word = word + ch;

			} else {
				if (word.length() > largest.length()) {
					largest = word;
				}
				word = "";
			}

		}
		if (word.length() > largest.length()) {
			largest = word;

		}
		System.out.println("Largest String = " + largest);

	}

}
