package com.java.grhombus.Arrays;

import java.util.Stack;
import java.util.regex.Pattern;

public class CheckParanthsis {
	public static void checkpairs(String str) {
		String open = "{[(", close = ")]}";

		Stack<Character> st = new Stack<>();
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if (open.indexOf(str.charAt(i)) >= 0) {
				st.push(str.charAt(i));
			}

			if (close.indexOf(str.charAt(i)) >= 0) 
			{
				
				if(st.size()>0)
				{
					char last=st.peek();
					if(current=='}' && last=='{' || current==')' && last=='('|| current==']' && last=='[')
					{
						st.pop();
					}
					
				}
			}
				
			}
		System.out.println(st.isEmpty()+"\tstackis empty\t"+"given"+str+"paranthesis  matching");
		
	}
public static void main(String[] args) {
	
	String str = "[]{(){}}()";

	checkpairs(str);
	
	
}
}
