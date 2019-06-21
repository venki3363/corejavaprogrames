package com.javapro.EDC;

public class ReverseWords1 {
public static void main(String[] args) {
	
	String str="today is a sunny day";
	String[] splitstr = str.split(" ");
	String s="";
	for (int i = splitstr.length-1; i >=0; i--)
	{
		s=s+splitstr[i]+" ";
	}
	
	System.out.println(s);
}
}
