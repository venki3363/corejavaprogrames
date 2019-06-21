package com.java.grhombus.Arrays;

public class ElementappearKtimesinArray {

	static void getcountofeachelem(int[] a, int k) {

		int count[] = new int[a.length];

		for (int aa : a) {

			count[aa]++;
		}
		int j = 0;

		for (int i : count) {
			if (i == k)
				System.out.println(j + " repeated " + i+"-->\ttimes");
			j++;
		}

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2, 3, 5, 2, 1,5 };
		int k = 2;
		getcountofeachelem(a, k);
	}
}
