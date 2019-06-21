package com.java.grhombus.Arrays;

import java.util.Arrays;

public class Returnprevoiusmaxvalue {

	static void previousmaxvalue(int[] a, int x) {
		int k = 0;
		for (int i : a)
		{
			if (i < x) 
			{
				k = i;

			}
		}
		
		System.out.println(k);
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 10, 3, 4, 5, 15, 6, 7 };

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		previousmaxvalue(a, 234);

	}

}
