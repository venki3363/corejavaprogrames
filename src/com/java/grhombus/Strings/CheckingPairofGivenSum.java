package com.java.grhombus.Strings;

import java.util.Arrays;

public class CheckingPairofGivenSum {

	static void getpairsSum(int[] a) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int i = 0;
		int j = a.length - 1;
		int sum = 10;
		while (i < j) {
			if (a[i] + a[j] > sum) {
				j--;

			} else if (a[i] + a[j] < sum) {
				i++;

			} else {
				System.out.println("(" + a[i] + "," + a[j] + ")");
				i++;
			}

		}

	}

	public static void main(String[] args) {

		int[] a = { -2, -1, 1, 1, 4, 5, 8, 6, 2, 7, 7, 3, 9 };
		getpairsSum(a);

	}
}
