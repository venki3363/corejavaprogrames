package com.java.grhombus.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedArrayTargetValues {
	
public static void main(String[] args) {
	
	Integer a[]={1,3,6,8};
	Integer k=9;
	List<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
	
		if(list.contains(k)){
			System.out.println(list.indexOf(k));
		}else
		{
			list.add(k);
			Collections.sort(list);
			System.out.println(list);
			
			System.out.println(list.indexOf(k));
		}
	

	
}
}
