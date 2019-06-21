package com.javapro.EDC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class ReverseOrder {
	public static void main(String[] args) {

		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("Microsoft", "Bill Gates");
		lhm.put("Apple", "Steve Jobs");
		lhm.put("Google", "Sundar Pichai");
		lhm.put("LinkedIn", "Reid Hoffman");
		lhm.put("Facebook", "Mark Zuckerberg");

		Set<String> keySet = lhm.keySet();

		ArrayList<String> al= new ArrayList<String>(keySet);

		Collections.reverse(al);

		Iterator<String> iterator = al.iterator();

		while (iterator.hasNext())
		{
			String next = iterator.next();

			System.out.println(next + ":\t\t---> " + lhm.get(next));

		}

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(3, "amrenra");

		map.put(99, "kush");
		map.put(5, "sammer");

		System.out.println(map);

		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(map);
		System.out.println(tmap);
		ArrayList<Integer> alist = new ArrayList<Integer>(tmap.keySet());

		for (int i = alist.size() - 1; i >= 0; i--)

		{

			System.out.println(i+""+tmap.get(alist.get(i)));

		}
	}
}
