package com.java.grhombus.Arrays;

import java.util.Arrays;

public class GetintvalueCountWithOutHashMap {

	static void getcount(int[] a, int len) {
		int noccurance = 1;
		for (int i = 0; i <len; i++) {

			if (i < len - 1 && a[i] == a[i + 1]) {
				noccurance++;
			} else if (i == len - 1 ||a[i] != a[i + 1]) {
				System.out.println(a[i] + "occurs " + noccurance);
				noccurance = 1;
			}

			
			
		}

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 6, 6, 7, 8, 9, 1, 2 };
		Arrays.sort(a);
		int len = a.length;
		getcount(a, len);
	}
}
