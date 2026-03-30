package com.arraystringcombine;

public class CountVowelconsonants {
public static void main(String[] args) {
	String str="programming";
	int vowel=0;
	int consonants=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			vowel++;
		}else if(ch[i]>='a'&&ch[i]<='z') {
			consonants++;
		}
		
	}
	System.out.println("number of vowel ="+vowel);
	System.out.println("number of consonants ="+consonants);
}
}
