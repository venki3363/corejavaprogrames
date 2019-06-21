package com.javapro.EDC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class ReverseString {
	public static void main(String[] args) {

		String s = "today is sunny day";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		StringTokenizer st = new StringTokenizer(s);
		String msg = "";
		while (st.hasMoreTokens()) {
			// System.out.println(st.nextToken());
			msg = st.nextToken() + " " + msg;

		}

		System.out.println(msg);

		String input = "today is sunny day";
		char[] hello = input.toCharArray();
		List<Character> trial1 = new ArrayList<>();

		for (char c : hello)
			trial1.add(c);

		Collections.reverse(trial1);
		ListIterator li = trial1.listIterator();
		while (li.hasNext())
			System.out.print(li.next());
	}
}
