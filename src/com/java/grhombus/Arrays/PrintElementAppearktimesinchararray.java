package com.java.grhombus.Arrays;

public class PrintElementAppearktimesinchararray {
	static void getcountofeachelem(char[] a, int k) {
		final int ascii = 256;
		int[] count = new int[ascii];

		for (int aa : a) {

			count[aa]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] >= k)
				System.out.println((char)(i)+ " occurs" + count[i]);
		}

	}

	public static void main(String[] args) {

		char ch[] = { 'a', 'b', 'c', 'b', 'd', 'e', 'd', 'd', 'b' };

		int k = 3;

		getcountofeachelem(ch, k);
	}
}
