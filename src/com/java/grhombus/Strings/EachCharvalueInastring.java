package com.java.grhombus.Strings;

public class EachCharvalueInastring {
	public static void main(String[] args) {

		int n[] = new int[26];

		String s = "venkateshPallavi";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {

				n[s.charAt(i) - 65]++;
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				n[s.charAt(i) - 97]++;
			}

		}

		for (int j = 0; j < 26; j++) {
			if (n[j] > 1) {
				System.out.println((char) (j + 65) + "\toccurs " + n[j] + "times");

			}
		}

	}
}
