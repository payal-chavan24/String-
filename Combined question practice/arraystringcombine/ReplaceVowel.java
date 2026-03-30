package com.arraystringcombine;

public class ReplaceVowel {
	public static void main(String[] args) {
		String str = "payalchavan";
		char ch[] = str.toCharArray();
		char ch2[] = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'i') {

				ch2[i] += '*';

			} else {
				ch2[i] += ch[i];
			}
			System.out.println(ch2[i]);

		}
	}
}
