package com.arraystringcombine;

public class RemovingAllspace {
	public static void main(String[] args) {

		String str = "payal chavan is learning java";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				System.out.print(ch);

			}

		}

	}
}