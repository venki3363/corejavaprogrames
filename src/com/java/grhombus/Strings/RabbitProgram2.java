package com.java.grhombus.Strings;

public class RabbitProgram2 {
	static void getOccuringChar(String str) {

		int count[] = new int[256];

		int len = str.length();

	
		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
		}

		char ch[] = str.toCharArray();
		for (int i = 0; i < len; i++) {
			
			boolean flag=false;
			for (int j = 0; j <i; j++) {
				if (ch[i] == ch[j])
				{
					flag=true;
				    break;
			    }
			}
			if(!flag)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
			}
             
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "racecar", "abcdecac", "override", "madam" };
		for (String x : s) {
			getOccuringChar(x);
		}

	}
}
