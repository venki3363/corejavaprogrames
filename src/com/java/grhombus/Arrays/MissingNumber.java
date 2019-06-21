package com.java.grhombus.Arrays;

import java.util.Arrays;

public class MissingNumber {
public static void main(String[] args) {
	
	
	int a[]={1,3,4,5,6,7};
	int n=7;
	
	int total=(n*(n+1))/2;
	
	int asum = Arrays.stream(a).sum();
	
	int missing=total-asum;
	
	System.out.println(missing);
	
}
}
