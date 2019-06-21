package com.java.grhombus.Strings;

public class StringCompresssion {
public static void main(String[] args) {
	String str = "aaabbccc";
	StringBuffer sb=new StringBuffer();
	int count = 1;
	int i = 0;
	
	for(i = 0; i < str.length() - 1; i++)
	{
		if(str.charAt(i) == str.charAt(i+1))
		{
			count += 1;
		}
		else
		{
                            sb.append(str.charAt(i)).append(count);
			count = 1;
		}
	}

	// for last character
	if(str.charAt(str.length()-2) == str.charAt(str.length()-1))
                    sb.append(str.charAt(i)).append(count);
	else
		sb.append(str.charAt(i)).append(1);

	System.out.println(sb);
}
}
