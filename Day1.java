package com.tka;

public class Day1 {
//	Find length of a string (without using length())
	public void findingLength(String str) {
		char[] arr = str.toCharArray();
		int count = 0;
		for (char c : arr) {
			count++;
		}
		System.out.println("Length of the given String is =" + count);
	}

//	Print each character of a string
	public void printEachChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);

		}

	}

//	Count vowels and consonants
	public void countVowelConsonnats(String str) {
		String str1 = str.toUpperCase();
		int vowel = 0;
		int consosnate = 0;
		for (int i = 0; i < str1.length(); i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
			if (str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O'
					|| str1.charAt(i) == 'U') {
				vowel++;
			} else  {
				consosnate++;
			}
			}

		}
		System.out.println("Count of vowel in given String =" + vowel);
		System.out.println("Count of consosnatein given String =" + consosnate);

	}

//	Reverse a String
	public void reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));

		}

	}

//	Check whether a String is Palindrome
	public void palindrome(String str) {
		String name = str;
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			temp = temp + ch;

		}
		if (temp.equals(name)) {
			System.out.println("String is palindrome");

		} else {
			System.out.println("String is not palindrome");
		}

	}

//	Count Uppercase Letters in a String
	public void uppercase(String str) {
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) (arr[i] + 32);

		}
		System.out.println(arr);

	}

//	Count Lowercase Letters in a String
	public void lowerCase(String str) {
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) (arr[i] - 32);
		}
		System.out.println(arr);
	}

//	Count Digits in a String
	public void countString(String str) {
		int digit = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digit++;
			}

		}
		System.out.println("Digit in given String =" + digit);

	}

//	Count Special Characters in a String
	public void specialChar(String str) {
		int special = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9') && !(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				special++;
			}
			System.out.println("speccial charcter in given string =" + special);
		}

	}

//	Count Uppercase, Lowercase, Digits, and Special Characters in a Single Program
	public void countAllCharacter(String str) {
		String digit = "";
		String Uppercase = "";
		String Lowercase = "";
		String specialCharcter = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				Uppercase = Uppercase + str.charAt(i);

			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				Lowercase = Lowercase + str.charAt(i);
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digit = digit + str.charAt(i);

			}else {
				specialCharcter=specialCharcter+str.charAt(i);
			}

		}
		System.out.println("Lowecase =" + Lowercase);
		System.out.println(" Uppercase =" + Uppercase);
		System.out.println("digit ="+digit);
		System.out.println("specialCharcter =" + specialCharcter);

	}

//	Reverse a String without using StringBuilder.reverse()
	public void reverseString1(String str) {
		char arr[] = str.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		for (char c : arr) {
			System.out.println(c);
		}

	}

//	Check Palindrome without creating a reversed String
	public void palindromWithoutreverse(String str) {
		boolean ispalindrome = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				ispalindrome = false;
			}

		}
		if (ispalindrome == true) {
			System.out.println("Given String is palindrome ");

		} else {
			System.out.println("Given String is not palindrome ");
		}

	}

//	Reverse each Word in a Sentence
	public void reverseEachword(String str) {
		String store = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				store = store + ch;

			} else {
				for (int j = store.length() - 1; j >= 0; j--) {
					System.out.print(store.charAt(j) + " ");

				}
				store = "";
			}

		}
		for (int i = store.length() - 1; i >= 0; i--) {
			System.out.println(store.charAt(i));

		}

	}
}
