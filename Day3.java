package com.tka;

public class Day3 {
//	Count occurrence of a given character in a string
//	Example: "java" , 'a' → 2
	public void countOccurrence(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;

			}

		}
		System.out.println(ch + " =" + count);

	}

//	Find first occurrence index of a character
//	Example: "programming" , 'm' → 6
	public void findFirstOccurence(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.println(str.charAt(i) + "-> " + i);
				break;
			}

		}

	}

//	Find last occurrence index of a character
//	Example: "programming" , 'm' → 7
	public void findLastOccurence(String str, char ch) {
		int index = -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				index = i;

			}
		}
		System.out.println("Last occurence=" + index);
	}

//	Remove all spaces from a string
//	Example: "Java is fun" → "Javaisfun"
	public void removeSpace(String str) {
		String store = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				store = store + str.charAt(i);

			}

		}
		System.out.println(store);

	}

//	Replace all occurrences of a character with another
//	Example: "banana" replace 'a' with 'x' → "bxnxnx"
	public void replace(String str, char oldchar, char newchar) {
		String store = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == oldchar) {
				store = store + newchar;

			} else {
				store = store + str.charAt(i);
			}

		}
		System.out.println(store);

	}

//	Check if a string contains a given character
//	Example: "hello" contains 'e' → true/false
	public boolean checkinContain(String str, String str2) {
		boolean isFound = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.contains(str2)) {
				isFound = true;

			}

		}
		if (isFound == true) {
			return true;

		} else {
			return false;
		}

	}

//	Check if a string contains a substring
//	Example: "programming" contains "gram" → true/false
	public boolean checkinContain1(String str, String str2) {
		boolean isFound = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.contains(str2)) {
				isFound = true;

			}

		}
		if (isFound == true) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Day3 d = new Day3();
		d.countOccurrence("Java", 'a');
		d.findFirstOccurence("Programming", 'm');
		d.findLastOccurence("Programming", 'm');
		boolean check = d.checkinContain("Hello", "e");
		System.out.println(check);
		boolean check1 = d.checkinContain1("Programming", "pram");
		System.out.println(check1);
	}

}
