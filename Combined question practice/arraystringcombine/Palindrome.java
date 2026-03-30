package com.arraystringcombine;

public class Palindrome {
public static void main(String[] args) {
	String str="madam";
	char array[]=str.toCharArray();
	int start=0;
	int end =array.length-1;
	boolean ispalindrome =true;
	while (start < end) {
		if (array[start] != array[end]) {
			ispalindrome = false;

		}
		start++;
		end--;

	}
	if(ispalindrome==true) {
		System.out.println(str+" is palindrome");
		
	}else {
		System.out.println(str+" is not palindrome");
	}
	
	
	
}
}
