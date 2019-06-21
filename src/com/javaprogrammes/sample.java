package com.javaprogrammes;

import java.util.Arrays;
import java.util.Random;

public class sample {
	public static void main(String[] args) {

		// Given one Array with some values (3, 1, 2, 3, 4, 5) and need to
		// remove the value randomly of user’s choice
		// 1st method
		int a[] = { 4, 6, 8, 10, 66, 56 };
		Random r = new Random();
		int p = r.nextInt(a.length - 1);
		int b[] = new int[a.length - 1];
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != p) {
				b[temp++] = a[i];
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
