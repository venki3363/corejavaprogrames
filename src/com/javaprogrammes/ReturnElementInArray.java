package com.javaprogrammes;

import java.util.Arrays;

public class ReturnElementInArray {

	public static void main(String[] args) {

		char ch[] = { 'a', 'b', 'c', 'b', 'd', 'e', 'd', 'd', 'b' };

		final int chars = 256;
		int [] count = new int[chars];

		for (char c : ch) {
			count[c]++;

		}
		int k = 3;
		for (int i = 0; i < count.length; i++) {
			if (count[i] == k)
				System.out.println((char) i + " occurs" + count[i]);
		}

	}
}