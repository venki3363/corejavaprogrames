package com.javaprogrammes;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateZeros {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		
		ArrayList al1=new ArrayList<>();
		
		int a[]={0,1,2,0,3,0,0};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
				al.add(a[i]);
			}
			else
			{
				al1.add(a[i]);
			}
		}
		
		while(count<a.length)
		{
			a[count++]=0;
		
			
		}
		
		System.out.println(Arrays.toString(a));
		
		al1.addAll(al);
		System.out.println(al1);
	}
}
