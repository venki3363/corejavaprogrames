
public class DigitsSum 
{
	
	public static int digitsSum(int n)
	{
		int rem,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
		
	}
public static void main(String[] args) {
	
	int num=12456;
	int digitsSum = digitsSum(num);
	
	System.out.println(digitsSum);
	
}
}
