package com.tka;

public class Day3_extra {
//	1. Check if a string contains a given character
//	Input: "hello", 'e'
//	Output: true
	public boolean checkContain(String str, char ch) {
		boolean isfount = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				isfount = true;

			}

		}
		if (isfount == true) {
			return true;

		} else {
			return false;
		}

	}

//	2. Check if a string contains a substring
//	Input: "programming", "gram"
//	Output: true
	public boolean chekSubString(String str, String target) {
		boolean isfound = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.contains(target)) {
				isfound = true;

			}

		}
		if (isfound == true) {
			return true;

		} else {
			return false;
		}

	}

//	3. Find first occurrence of a character
//	Input: "programming", 'm'
//	Output: 6
	public void findFirstOccrance(String str, char target) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				System.out.println(i);
			}

		}

	}

//	4. Find last occurrence of a character
//	Input: "programming", 'm'
//	Output: 7
	public void findFirstOccrance2(String str, char target) {
		int index = -1;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == target) {
				index = i;
			}

		}
		System.out.println(index);

	}

//	5. Count duplicate characters in a string (basic level)
//	Input: "banana"
//	Output: a, n
	public void duplicate(String str) {
		
		
		for (int i = 0; i < str.length(); i++) {
			boolean isfound=false;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					isfound=true;
				}

			}
			if (isfound==true) {
				System.out.println(str.charAt(i));

			}

		}

	}

//	6. Reverse string using swapping logic
//	Input: "java"
//	Output: "avaj"
	public void swapping(String str) {
		char arr[] = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		Day3_extra day3=new Day3_extra();
		Boolean result=day3.checkContain("Payal", 'l');
		System.out.println(result);
		System.out.println(day3.chekSubString("Payal", "al"));
		day3.findFirstOccrance("Payal", 'l');
		day3.findFirstOccrance2("java", 'a');
		day3.duplicate("banana");
		day3.swapping("java");
	}

}
