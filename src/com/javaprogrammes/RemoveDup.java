package com.javaprogrammes;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDup {

	public static void main(String[] args) {

		String[] st = { "java", "selenium", "python", "java", "selenium", "devops", "aws", "angular", "aws" };

		// without set

		Arrays.sort(st);

		System.out.println(Arrays.toString(st)); 

		for (int i = 0; i < st.length; i++) {
			if (i < st.length - 1 && st[i] == (st[i + 1])) {
				continue;
			}

			System.out.println(st[i]);
		}

		// with set

		HashSet<String> hs = new HashSet<String>();
		
		for (String string : st) {
			hs.add(string);

		}

		System.out.println(hs);
	}
}
