package com.stringpractice;

//6️⃣ Replace spaces with special character
//
//👉 "I love SQL" → "I@love@SQL"
public class fillSpace {
public static void main(String[] args) {
	String str="I love Sql";
	String str2="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch!=' ') {
			str2=str2+ch;
			
		}else {
			str2=str2+'@';
		}
		
	}
	System.out.println(str2);
}
}
