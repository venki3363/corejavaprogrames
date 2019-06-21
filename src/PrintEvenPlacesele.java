
public class PrintEvenPlacesele {
public static void main(String[] args) {
	
	int a=15643753;
	String s = String.valueOf(a);
	
	for (int i = 1; i < s.length(); i=i+2) 
	{
		System.out.println(s.charAt(i));
		
	}
	
}
}
