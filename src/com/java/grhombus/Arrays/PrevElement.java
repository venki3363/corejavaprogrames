package com.java.grhombus.Arrays;

public class PrevElement 
{
	
	public static int ReturnPrevElement(int[] a,int k)
	{
		for (int i = 0; i < a.length; i++)
		{
			if(a[0]==k)
			{
				return 0;
			}
			else if(a[i]==k)
			{
				System.out.println("1111111111111");
				return a[i-1];
				
			}
			else if(a[i]>k)
			{System.out.println("2222222222222222222");
				return a[i-1];
			}
			else if(a[a.length-1]<k)
			{System.out.println("333333333333333333");
				return a[a.length-1];
			}
		}
		return k;
		
	}
public static void main(String[] args) {
	
	int a[]={1,3,5,7,9};
	int k=0;
	
	int retval = ReturnPrevElement(a, k);
	
	System.out.println(retval);
	
	
}
}
