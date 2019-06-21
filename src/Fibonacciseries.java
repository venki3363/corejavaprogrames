
public class Fibonacciseries {
	static void fibanossci(int max)
	{
		int n1=1;
		int n2=3;
		
		int i=0;
		
		int n3;
		
		while(i<max)
		{
			 n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
			i++;
			
		}
	}
public static void main(String[] args) {
	
	int max=10;
	
	fibanossci(max);
}
}
