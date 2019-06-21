package com.javaprogrammes;

import java.util.Arrays;

public class UniqueStrings {
public static void main(String[] args) {
	
	String[] s={"java","selenium","python","java","python","angular"};
	
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));
	//1st method
	for (int i = 0; i < s.length; i++) 
	{
		boolean isDistinct=false;
		for (int j = 0; j < i; j++) 
		{
			
			if(s[i].equals(s[j]))
			{
				isDistinct=true;
				break;
			}
		}
		
		if(!isDistinct)
		{
			System.out.println(s[i]);
		}	
	}
	
	
	
	System.out.println("----------------");
	//2nd method
	
	Arrays.sort(s);
	
	for (int i = 0; i <s.length; i++) 
	{
		if(i==s.length-1|| s[i]!=s[i+1])
		{
			System.out.println(s[i]);
		}
		
		
		
	}
	
	
}
}
