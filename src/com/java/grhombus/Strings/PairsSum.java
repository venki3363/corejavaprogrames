package com.java.grhombus.Strings;

public class PairsSum {
	public static void main(String[] args) {

		int a[] = { 1, 4, 5, 8, 6, 2, 7, 3, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 8) {
					System.out.println("(" + a[i] + "," + a[j] + ")");
				}
			}
		}
	}
}
