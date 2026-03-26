package com.stringpractice;

//6. Find Largest Word in String
//
//👉 "I love programming" → "programming"
public class FindLargest {
	public static void main(String[] args) {
		String str = "I love programming";
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
		System.out.println(largest);
	}
}
