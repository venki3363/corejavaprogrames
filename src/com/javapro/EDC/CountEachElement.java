package com.javapro.EDC;

import java.util.HashSet;

public class CountEachElement {
	public static void main(String[] args) {
		int num[] = { 2, 4, 6, 8, 4, 2 };
		int count[] = new int[10];
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			temp = num[i];
			count[temp]++;
		}
		for (int i = 0; i < count.length - 1; i++) {

			if (count[i] > 0)
				System.out.println(i + "--->" + count[i] + "times");

		}

		// 2nd way
		HashSet<Integer> al = new HashSet<Integer>();
		int a[] = { 2, 4, 6, 8, 4, 2 };

		for (int i = 0; i < a.length; i++) {

			al.add(a[i]);
		}

		for (int set : al) {
			int count1 = 0;
			for (int i = 0; i < a.length; i++) {
				if (set ==a[i]) {
					count1++;
				}
			}

			System.out.println(set + " " + count1 + "times");

		}

	}
}
