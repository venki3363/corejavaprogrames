package com.javaprogrammes;

public class missingnumber {

	public static void main(String[] args) 
	{
		//approach-1
		
		int a[]={1,2,3,5,6,8};
		
		int n=a[a.length-1];
		int total=(n*(n+1))/2;
		System.out.println(total);
		for (int i = 0; i < a.length; i++) {
			total-=a[i];
		}
		
		System.out.println(total);
	
		System.out.println("##########");
		
		
	//approach-2
	int reg[]=new int[a[a.length-1]+1];
	
	for(int i:a)
	{
		
		reg[i]=1;
		
	}
	
    for (int i = 1; i <reg.length; i++) {
	 if(reg[i]!=1) {
		 
		System.out.println(i); 
	 }
	
	}

    //approach-3
   int index=0;
   int length=a[a.length-1]+1;
   String k="";
 for (int i = 1; i < length; i++) 
{
	if(i==a[index])
	{
		index++;
	}
	else
	{
		k=k+String.valueOf(i)+" ";
	}	
	
}
	System.out.println(k);
}
}
