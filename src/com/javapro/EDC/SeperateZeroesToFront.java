package com.javapro.EDC;

import java.util.Arrays;

public class SeperateZeroesToFront {
	public static void main(String[] args) {
		int a[] = { 1, 0, 4, 0, 5, 6, 0, 8 };
		int temp = a.length - 1;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0) {
				a[temp--] = a[i];
			}
		}

		while (temp >= 0) {
			a[temp--] = 0;
		}

		System.out.println(Arrays.toString(a));
	}
}
