package com.javapro.EDC;

import java.util.Arrays;

public class StringsAnagrams {
public static void main(String[] args) {
	boolean flag=true;
	String s1="venki";
	String s2="ekinv";
	
	 if(s1.length()!=s2.length())
	  {
	      flag=false;
	  }
	  else 
	  {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean b = Arrays.equals(ch1, ch2);

			System.out.println(b);
	}
}
}
