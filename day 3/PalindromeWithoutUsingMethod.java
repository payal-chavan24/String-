package com.stringpractice;

public class PalindromeWithoutUsingMethod {
	public static void main(String[] args) {
		String str = "Payal";
		char arr[] = str.toCharArray();
		boolean ispalindrome = true;
		int start = 0;
		int end = arr.length - 1;//4
		while (start < end) {
			if (arr[start] != arr[end]) {
				ispalindrome = false;

			}
			start++;
			end--;

		}
		if (ispalindrome == true) {
			System.out.println(str + " is palindrome");

		} else {
			System.out.println(str + " is not palindrome");
		}
	}
}
