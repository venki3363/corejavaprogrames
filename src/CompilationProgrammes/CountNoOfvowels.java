package CompilationProgrammes;

public class CountNoOfvowels {
public static void main(String[] args) {
	
	String s="venkatesh";
	
	char[] ch = s.toCharArray();
	int vowels=0;
	for(char c:ch)
	switch (c) {
	case 'a':	
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		vowels++;
	
		
	}
	System.out.println(+vowels);
	
}
}
