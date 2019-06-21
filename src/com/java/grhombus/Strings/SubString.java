package com.java.grhombus.Strings;

public class SubString {
	public static void main(String[] args) {

		String s = "inbbusdiabbbus";

		String s2 = "bbbus";
		char[] ch1 = s2.toCharArray();
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == ch1[count]) {
				count++;
			} else {
				i = i - count;
				count = 0;
			}

			if (s2.length() == count) {
				System.out.println("substring");
				break;
			}

		}

	}
}
