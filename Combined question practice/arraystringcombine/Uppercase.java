package com.arraystringcombine;

public class Uppercase {
	public static void main(String[] args) {
		String str = "hello";
		String str2 = "";
		char ch[] = str.toCharArray();
		char ch2[] = new char[ch.length - 1];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				str2 = str.toUpperCase();

			}

		}
		System.out.println(str2);
	}
}
