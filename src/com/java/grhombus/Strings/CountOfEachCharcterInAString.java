package com.java.grhombus.Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfEachCharcterInAString {

	static void geteaccountcharinastring(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();

		for (char c : ch)
		{
		 if (hm.containsKey(c)) 
			{
				hm.put(c, hm.get(c) + 1);
				
			} 
		 else 
			{
				hm.put(c, 1);
			}
		}

		System.out.println(hm);

		Set<Entry<Character, Integer>> entrySet = hm.entrySet();

		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

	public static void main(String[] args) {

		String s = "racecar abcdecac overrise madam";

		String[] split = s.split(" ");

		for (String str : split) {
			geteaccountcharinastring(str);
		}

	}
}
