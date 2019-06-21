package com.java.grhombus.Strings;

public class WordCount {
public static void main(String[] args) {
	
	String str="   This is\tsample\nStrings";
	int wordcount=0; int flag=0;
	for (int i = 0; i < str.length(); i++) 
	{
		
		if(str.charAt(i)==' '||str.charAt(i)=='\t'||str.charAt(i)=='\n')
		{
			flag=0;
			
		}
		else if(flag==0)
		{
			flag=1;
		   wordcount++;
		}
	}
	
	
	System.out.println(wordcount);
	
	
}
}
