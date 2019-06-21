package com.java.grhombus.Arrays;

import java.util.Arrays;

public class ArrayUniquereturn {
public static void main(String[] args) {
	
	int a[]={1,2,3,5,2,4,6};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int k=0;
	for (int i=0; i < a.length; i++) {
		if(i==a.length-1 || a[i]!=a[i+1])
		{
			a[k++]=a[i];
		}
	}
	
	
	
	a = Arrays.copyOf(a, k);
	System.out.println(Arrays.toString(a));
	
	
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]>2.5)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
}
}
