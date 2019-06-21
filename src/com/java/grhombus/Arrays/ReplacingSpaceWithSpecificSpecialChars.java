package com.java.grhombus.Arrays;

import java.util.Arrays;

public class ReplacingSpaceWithSpecificSpecialChars {

	
	static String replacewithSpecialChars(char[] ch,int len)
	{
		int spacecount=0;
		for (int j=0;j<len;j++)
		{
			if(ch[j]==' ')
			{
				spacecount++;
			}
		}
		
		int newlenth=len+spacecount*2;
		ch=Arrays.copyOf(ch, newlenth);
		
		System.out.println(Arrays.toString(ch));
		int index=newlenth-1;
		
		
		for(int j=len-1;j>=0;j--)
		{
			System.out.println(ch[j]);
			if(ch[j]==' ')
			{
				
				ch[index]='0';
				ch[index-1]='2';
				ch[index-2]='%';
				index=index-3;
			}
			else
			{
				ch[index]=ch[j];
				index--;
			}
		}
		return String.valueOf(ch);
	}
	public static void main(String[] args) {
		
		String s="i am venkatesh";
		char[] ch = s.toCharArray();
		
		int len = ch.length;
		
		String str = replacewithSpecialChars(ch, len);
		System.out.println(str);
	}
}
