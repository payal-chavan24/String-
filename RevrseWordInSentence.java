package com.stringpractice;

//. Reverse Words in Sentence
//
//👉
//Input: "I love Java"
//Output: "Java love I"
public class RevrseWordInSentence {
	public static void main(String[] args) {
		String str = "I love Java";
		String word = "";
		String word1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);

			word = word + ch;
		}
		// System.out.print(word);
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch != ' ') {
				word1 = word1 + ch;

			} else {
				for (int j = word1.length() - 1; j >= 0; j--) {
					System.out.print(word1.charAt(j));

				}
				System.out.print(" ");
				word1 = "";

			}

		}
		for (int k = word1.length() - 1; k >= 0; k--) {
			System.out.print(word1.charAt(k));

		}
	}
}
