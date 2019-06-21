package com.javapro.EDC;

import java.util.Arrays;
import java.util.Stack;

public class StringBalance {
	public static boolean chckforparen() {
		String str = "(({}))";
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
		if ((str.charAt(i) == '(') || (str.charAt(i) == '{')) {
		st.push(str.charAt(i));
		} else {
		if (st.isEmpty() || (st.peek() == '(' && str.charAt(i) != ')') || (st.peek() == '{' && str.charAt(i) != '}'))
		return false;
		else st.pop();
		}
		}
		if (st.isEmpty()) return true;

		return false;
		}
	
public static void main(String[] args)
{
	boolean b = chckforparen();
	if(b)
		System.out.println(b);
	else
		System.out.println(b);
}
}
