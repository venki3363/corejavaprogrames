package com.javapro.EDC;

import java.util.Arrays;

public class SeperateZeroesToEnd {
	public static void main(String[] args) {

		int a[] = { 1, 0, 4, 0, 5, 6, 0, 8 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[temp++] = a[i];
			}
		}

		while (temp < a.length) {
			a[temp++] = 0;

		}
		System.out.println(Arrays.toString(a));

	}
}
