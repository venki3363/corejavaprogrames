
public class CheckTwoStrings 
{
	static boolean anagram(String s1, String s2) 
	{
		StringBuilder sb = new StringBuilder(s2);
		if (s1.length() != s2.length()) 
		{
			return false;
		}
		else 
		{
			char ch[] = s1.toCharArray();
			for (char c : ch) 
			{
				int index = sb.indexOf("" + c);
				if (index !=-1) 
				{
					sb.deleteCharAt(index);
				} else 
				{
					return false;
				}
			}
		}
		 return sb.length()== 0 ? true : false;
	}
	
	static boolean checkTwoStrings(String s1,String s2)
	{
		boolean flag=false;
		String[] split = s1.split(" ");
		
		for (String s: split) {
			
			if(s2.contains(s))
			{
				flag= true;
			}
			else
			{
				flag=false;
				break;
			}
			
		}
		return flag;
		
	}
	
	
public static void main(String[] args) 
{
	String s1="It is a rainy day";
	String s2="rainy day jkIt is a";
	
	/*boolean anagram = anagram(s1, s2);
	if(anagram)
	System.out.println(anagram);
	else
	System.out.println("not");*/
	
	boolean checkTwoStrings = checkTwoStrings(s1, s2);
	
	if(checkTwoStrings)
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
	}


}
	


