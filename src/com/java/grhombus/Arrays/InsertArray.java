package com.java.grhombus.Arrays;

import java.util.Arrays;

public class InsertArray {
	
	static void  insertElement(int[] a,int pos,int ele)
	{
		for (int i=a.length-1; i >pos; i--) 
		{
			
			a[i]=a[i-1];
			
		}
		
		a[pos]=ele;
		
		String str = Arrays.toString(a);
		
		System.out.println(str);
	}
public static void main(String[] args) {
	
	int a[]={1,2,3,5,4,6};
	int pos=3;
	int ele=8;
	
	insertElement(a, pos, ele);
	
}
}
