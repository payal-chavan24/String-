package com.stringpractice;

public class LongestSubString {
	public static void main(String[] args) {
		String str = "abcabccbb";
		int maxLength = 0;
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			String temp = "";
			int length = 0;
			for (int j = i; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (temp.contains(ch + "")) {
					break;
				}

				temp = temp + ch;
				length++;
			}
			if (length > maxLength) {
				maxLength = length;
				result = temp;

			}

		}
		System.out.println("Longest subString ="+result);
		System.out.println("Length of longest SubString ="+maxLength);
	}
}
