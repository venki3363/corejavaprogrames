package com.java.grhombus.Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RabbitProgram1 {
	public static void main(String[] args) {

		String s1 = "rabbit";
		String s2 = "bb";

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();

		char[] ch = s1.toCharArray();

		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}

		}

		char[] ch2 = s2.toCharArray();

		for (char cc : ch2) {
			if (hm1.containsKey(cc)) {
				hm1.put(cc, hm.get(cc) + 1);
			} else {
				hm1.put(cc, 1);
			}

		}

		Set<Character> keySet = hm1.keySet();
		boolean status = false;
		for (Character key : keySet) {
			if (hm.containsKey(key) & hm.get(key) >= hm1.get(key)) {
				status = true;
			} else {
				status = false;
			}
		}

		if (status) {
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}
}
