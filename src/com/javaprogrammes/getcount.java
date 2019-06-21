package com.javaprogrammes;

import java.util.Arrays;
import java.util.HashSet;

public class getcount {
	public static void main(String[] args) {
		int num[] = { 2, 4, 6, 8, 4, 2 };
		int count[] = new int[10];
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			temp = num[i];
			count[temp]++;
		}
		
		for (int i = 0; i < count.length - 1; i++) {

			if (count[i] >0)
				System.out.println(i + "  " + count[i]+"\ttimes");

		}

		System.out.println("#######################");

		int[] a = { 1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1 };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int nbOccurences = 1;

		for (int i = 0; i < a.length; i++) {
			if (i<a.length -1 && a[i] == a[i + 1]) {
				 
					nbOccurences++;
				
			}

			if (i == a.length -1  ||a[i] != a[i + 1]) {
				System.out.println(a[i] + " occurs " + nbOccurences + " time(s)"); 
				nbOccurences = 1;
			}

		}
		
		System.out.println("**************************************");
		
		HashSet<Integer> al = new HashSet<Integer>();

		// Store the array in set as set will store unique elemnets
		for (int i = 0; i < a.length; i++) {
			// int count =0;
			al.add(a[i]);
		}
		// printing the set
		System.out.println("al " + al);

		for (int set : al) {
			int count1 = 0;
			for (int j = 0; j < a.length; j++) {

				if (set == a[j]) {
					count1++;
				}
			}
			System.out.println(set + " occurs " + count1 + " times");
		}
	}
}
