package com.java.grhombus.Strings;

public class SearchACharFromString {
	static boolean flag = false;

	static boolean SearchCharinString(String str, char c) {
		if (str.contains(String.valueOf(c))) {
			flag = true;
		} else

		{
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {

		String s = "Manjusha";

		if (SearchCharinString(s, 'k')) {
			System.out.println("true\t" + "Test passed");
		} else {
			System.out.println("false\t" + "Test failed");
		}

	}
}
