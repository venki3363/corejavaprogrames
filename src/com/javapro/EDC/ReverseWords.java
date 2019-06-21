package com.javapro.EDC;

public class ReverseWords {

	public static void main(String[] args) {
		
		String str="today is a sunny day";
		
		String[] splitstr = str.split(" ");
		
		for (int i = 0; i < splitstr.length; i++) 
		{
			String s = splitstr[i];
			
			for (int j = s.length()-1;j>=0;j--)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
