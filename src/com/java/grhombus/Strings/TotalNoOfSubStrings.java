package com.java.grhombus.Strings;

public class TotalNoOfSubStrings {
	public static void main(String[] args) {

		String s = "abc";
		int n = s.length();

		int totalsubstrings = n * (n + 1) / 2;
		System.out.println(totalsubstrings);
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j <= ch.length; j++) {
				System.out.println(s.substring(i, j));
				;
			}
		}
	}
}
