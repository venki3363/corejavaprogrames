package com.java.grhombus.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepettitiveCharInAstring {

	static void firstRepChar(char[] ch) {
		Set<Character> hs = new LinkedHashSet<>();
		for (Character c : ch) {
			if (hs.add(c) == false) {
				System.out.println(c);
				break;
			}

		}

	}

	public static void main(String[] args) {
		String input = "abbcaddbeaff";

		char[] ch = input.toCharArray();
		firstRepChar(ch);

	}
}
