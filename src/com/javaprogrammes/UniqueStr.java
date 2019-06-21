package com.javaprogrammes;

import java.util.Arrays;

public class UniqueStr {

	public static void main(String[] args) {
		
		String[] s={"java","selenium","python","java","python","angular"};
		Arrays.sort(s);
		
		for (int i = 0; i <s.length; i++) 
		{
			if(i<s.length-1 && s[i]==s[i+1]  )
			{
				continue;
			}
			
			System.out.println(s[i]+" " );	
		}
	}
}
