package com.arraystringcombine;

public class Frequency {
public static void main(String[] args) {
	String str="programming";
	char ch[] =str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count=0;
		boolean iscounted=false;
		for(int j=0;j<i;j++) {
			if(ch[i]==ch[j]) {
				iscounted=true;
				
			}

		}
		if(iscounted) {
			continue;
			
		}
		
		if(!iscounted) {
			for(int k=0;k<ch.length;k++) {
				if(ch[i]==ch[k]) {
					count++;
					
				}
				
				
			}
			
		}
		System.out.println(ch[i]+" "+count);
		
	}
	
}
}
