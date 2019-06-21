
public class Armstrong 
{
	
	public static int countDigits(int n)
	{int count=0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		return count;
	}
	public static int checkArmstrongNum(int n)
	{int rem,armsum=0;
		int digitscount = countDigits(n);
		while(n>0)
		{   rem=n%10;
		    armsum+=Math.pow(rem, digitscount);
			n/=10;
			
		}
		return armsum;
		
		
	}
public static void main(String[] args)
{
	int num=1634;
	int armstrongNum = checkArmstrongNum(num);
	if(num==armstrongNum)
	{
		System.out.println(num+"is armstrong");
	}
	else
	{
		System.out.println(num+"is not a armstrong");
		
	}
}
}
