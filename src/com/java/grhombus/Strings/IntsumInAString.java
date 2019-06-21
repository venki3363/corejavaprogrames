package com.java.grhombus.Strings;

public class IntsumInAString {
	public static void main(String[] args) {

		String s = "abc123cd45ef2c5";
		int sum = 0;
		String doconcat = "";
		int i;
		for (i = 0; i < s.length(); i++)
		{
			if (Character.isDigit(s.charAt(i)))
			{
				doconcat = doconcat + s.charAt(i);
				
			} 
			else
			{
				if (doconcat != "")
				{
					sum = sum + Integer.parseInt(doconcat);

					doconcat = "";
				}
			}
           
			if(i==s.length()-1 && Character.isDigit(s.charAt(i)))
			{
				sum=sum + Integer.parseInt(doconcat);
			}
		   }
	

		System.out.println(sum);
	}
}
