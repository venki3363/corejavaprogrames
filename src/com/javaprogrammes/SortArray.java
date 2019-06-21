package com.javaprogrammes;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int a[] = { 10, 5, 15, 6, 2, 30, 25 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(a));
	}
}
