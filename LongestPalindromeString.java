package com.stringpractice;

public class LongestPalindromeString {

    public static void main(String[] args) {

        String str = "babad";
        char[] arr = str.toCharArray();

        int maxLength = 0;
        int startIndex = 0;

        
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int left = i;
                int right = j;
                boolean isPalindrome = true;

               
                while (left < right) {
                    if (arr[left] != arr[right]) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                
                if (isPalindrome && (j - i + 1) > maxLength) {
                    maxLength = j - i + 1;
                    startIndex = i;
                }
            }
        }

       
        System.out.print("Longest Palindrome: ");
        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.print(arr[i]);
        }
    }
}