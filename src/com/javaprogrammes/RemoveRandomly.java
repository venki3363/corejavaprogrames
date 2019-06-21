package com.javaprogrammes;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveRandomly
{

	/*Given one Array with some values (3, 1, 2, 3, 4, 5) and need to 
	remove the value randomly of user’s choice*/
	public static void main(String[] args) {
		
		
		    int a[]={4,6,8,10,66,56};
		   
	        int p=3;
	        
	        int temp=0;
	        for (int i = 0; i < a.length; i++)
	        {
				if(i!=p)
				{
					a[temp++]=a[i];
				}
			}
	        a=Arrays.copyOf(a, temp);
	        
	        System.out.println(Arrays.toString(a));
	       
	        
	        
	}
	
	
}
