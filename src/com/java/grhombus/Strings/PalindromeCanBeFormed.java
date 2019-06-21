package com.java.grhombus.Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PalindromeCanBeFormed {
	
	
	public static int makePlaindrone(String str1)
    {
		Map hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<=str1.length()-1;i++) {
			
		if(hm.containsKey(str1.charAt(i))){
			
		hm.put(str1.charAt(i), hm.get(str1.charAt(i)+1));
		}
		else 
		{
		hm.put(str1.charAt(i), 1);
		}
		}
		
		int oddValue=0;
		int evenValue=0;
		//for(char key:hm.keySet())
		Iterator<Character> l = hm.keySet().iterator();
		while(l.hasNext()) {
			Character n = l.next();
		
		
		if(hm.get(n)%2==0)
		{
		evenValue++;
		}else 
		{
		oddValue++;	
		}
		}
		
		if((evenValue>=1&&oddValue==0)||(oddValue>=1&&evenValue==0)) 
		{
		return 1;
		}
		if((evenValue==1&&oddValue==1)||(evenValue>=1&&oddValue==1))
		{
			
		return 1;
		}
		return 0;
		}

	public static void main(String args[]) {
		System.out.println(makePlaindrone("kanak"));
	}
}
