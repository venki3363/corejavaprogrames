

public class PrimeNo {
	
	public static  boolean checkPrimeNo(int num)
	{
		int i=2;
		
		
		boolean flag=true;
		while(i<num/2)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
			i++;
		}
		return flag;
		
	}
public static void main(String[] args) {
	
	int a[]={5,11,23,31,33,51,97,99,101};
	
	for (int i : a) {
		boolean b = checkPrimeNo(i);
		if(b){
			System.out.println(i+" is a prime no");
		}
		else
		{
			System.out.println(i+"\tnot a prime no");
		}
	}
	
	
	
	
}
}
