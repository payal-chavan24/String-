package com.arraystringcombine;

public class EvenPostion {
public static void main(String[] args) {
	String str="programming";
	char ch[]=str.toCharArray();
	for(int i=1;i<ch.length;i+=2) {
		System.out.println(ch[i]);
		
	}
}
}
