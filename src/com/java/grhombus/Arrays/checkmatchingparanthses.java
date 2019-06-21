package com.java.grhombus.Arrays;

import java.util.Stack;

public class checkmatchingparanthses {

	public static boolean ispartheses(char c1, char c2) {
		boolean flag = false;
		if (c1 == '[' && c2 == ']') {
			flag = true;
		}
		if (c1 == '(' && c2 == ')') {
			flag = true;
			;
		}
		if (c1 == '{' && c2 == '}') {
			flag = true;
		}
		return flag;

	}

	public static boolean checkpairs(String str) {
		String open = "{[(", close = ")]}";

		Stack<Character> st = new Stack<>();
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (open.indexOf(str.charAt(i)) >= 0) {
				st.push(str.charAt(i));
			}

			if (close.indexOf(str.charAt(i)) >= 0) {
				if (st.size() > 0) {
					boolean ispartheses = ispartheses(st.pop(), str.charAt(i));
					if (ispartheses) {
						flag = true;
					} else {
						flag = false;

						break;
					}
				}

			}
		}
		return flag;

	}

	public static void main(String[] args) {

		String str = "[]{(){}}()";

		boolean b = checkpairs(str);

		if (b) {
			System.out.println("parantnhses are matching");
		} else {
			System.out.println("paranthses are not matching");
		}

	}
}
