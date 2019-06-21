package com.java.grhombus.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairSumUsingCollection {

	public static void main(String[] args) {

		int[] arr = { -2, -1, 1, 1, 4, 5, 8, 6, 2, 7, 7, 3, 9 };

		int sum = 6;
		Set<Integer> set = new HashSet<Integer>();
		/*
		 * for (int num1 : arr) { int num2 = sum - num1; if
		 * (!set.contains(num1)) set.add(num2); else
		 * System.out.println(num1+","+num2); }
		 */

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int num1 : arr) {
			int num2 = sum - num1;
			if (!hm.containsKey(num2)) {
				hm.put(num1, 0);
			} else {
				System.out.println(num1 + " " + num2);
			}
		}

	}
}
