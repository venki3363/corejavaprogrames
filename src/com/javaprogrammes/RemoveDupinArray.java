package com.javaprogrammes;

public class RemoveDupinArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 50, 10, 30, 20, 50, 60 };

		for (int i = 0; i < a.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDistinct = true;
					break;
				}
			}

			if (!isDistinct) {

				System.out.println(a[i]);
			}
		}
	}
}
