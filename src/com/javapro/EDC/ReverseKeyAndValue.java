package com.javapro.EDC;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseKeyAndValue {
public static void main(String[] args) {
	
	 Map<String, String> test = new HashMap<String, String>();
	    test.put("a", "1");
	    test.put("d", "1");
	    test.put("b", "2");
	    test.put("c", "3");
	    test.put("d", "4");
	    test.put("d", "41");

	    System.out.println(test);

	  
	    Map<String, String> mapInversed = 
	            test.entrySet()
	               .stream()
	               .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

	    System.out.println(mapInversed);
}

}
