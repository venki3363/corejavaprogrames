package com.java.grhombus.Strings;

public class LettercountinString {
public static void main(String[] args) {
	
	String str="This is sample Strings ";
	int ltcount=0;
	int indx=0;
	for (int i = 0; i < str.length(); i++) {
		
		if(str.charAt(i)!=' ')
		{
			ltcount++;
		}
		indx++;
	}
	
	System.out.println(ltcount);
	System.out.println(indx);
}
}
