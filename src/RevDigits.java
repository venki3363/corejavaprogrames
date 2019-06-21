
public class RevDigits {
	
	public static int reverseDigit(int n)
	{
		int rem,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
			
		}
		
		
		return rev;	
	}
public static void main(String[] args) {
	
	
	int num=4567;
	
	int reverseDigit = reverseDigit(num);
	System.out.println(reverseDigit);
	
	
}
}
