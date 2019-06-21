package com.javapro.EDC;

public class StringAnagrams2 {

	static boolean anagram(String s1, String s2) {
		boolean flag = true;
		
		if (s1.length()!= s2.length())
		{
			return false;
		} else 
		{
			StringBuffer sb=new StringBuffer(s2);
			char[] c = s1.toCharArray();
			for (char ch : c) {
				
				int i = sb.indexOf(String.valueOf(ch));
				if (i != -1) 
				{
					//s2 = s2.substring(0, i) + s2.substring(i + 1);
					sb.deleteCharAt(i);
					
				} 
				if(sb.length()==0)
				{
					flag=true;
					return flag;
				}
				
				
				}
		}
		return flag;
		
		

	}

	public static void main(String[] args) {
		String s1 = "venki";
		String s2 = "ikenv";
		boolean b = anagram(s1, s2);

		if (b)
			System.out.println("strings are anagrams");
		else {
			System.out.println("strings are not anagrams");
		}

	}
}
