package com.java.grhombus.Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IfPalindromeGetCountOfFirstChar {
	public static void main(String[] args) {
		String s = "lemonnanomel";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		char[] ch = rev.toCharArray();
		for (char c : ch) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (rev.equals(s)) {
				System.out.println("first character\t" + entry.getKey() + "\tcount " + entry.getValue());
				break;
			} else {
				Integer max = Collections.max(hm.values());
				if (max == entry.getValue()) {
					System.out.println("max count character\t" + entry.getKey() + " " + entry.getValue());
					
				}
			}
		}
	}
}
