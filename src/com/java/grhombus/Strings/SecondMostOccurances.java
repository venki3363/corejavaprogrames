package com.java.grhombus.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SecondMostOccurances {
	static void secondMostRepititedNumber(int[] input) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int x : input) {
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
		}
		List<Integer> temp = new ArrayList<Integer>(map.values());
		System.out.println(temp);
		Collections.sort(temp);
		System.out.println(temp);
		for (int z : map.keySet()) {
			if (map.get(z)== temp.get(temp.size() - 2)) {
				System.out.println("Key is " + z + " & its count " + map.get(z));
				break;
			}
		}
	}

	public static void main(String[] args) {
		int input[] = { 1, 2, 3, 4, 7, 7, 7, 5, 1, 2, 3 };
		secondMostRepititedNumber(input);
	}
}
