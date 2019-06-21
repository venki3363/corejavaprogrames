package com.javapro.EDC;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "topspot";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
