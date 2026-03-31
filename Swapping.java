package com.stringpractice;

//3️⃣ Swap first and last character
//
//👉 Input: "hema"
//👉 Output: "aemh"
public class Swapping {
	public static void main(String[] args) {
		String str = "hema";
		char arr[] = str.toCharArray();
		String word = "";
		char temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]);
		}

	}
}
