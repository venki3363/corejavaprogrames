package com.java.grhombus.Strings;

public class Rabbitprogram {
	public static void main(String[] args) {

		String s1 = "rabbit";
		String s2 = "abb";
		
		
		int j=0;
		for (int i = 0; i < s1.length()&j<s2.length(); i++) {
			
			if(s1.charAt(i)==s2.charAt(j))
			{
				j++;
			}
		}
        if(s2.length()==j)
        {
        	System.out.println("given strings are in subseq"+s1+" "+s2);
        }
        else
        {
        	System.out.println("false");
        }
		

	}
}
