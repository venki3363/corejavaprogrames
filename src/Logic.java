import java.util.ArrayList;
import java.util.List;

public class Logic {
public static void main(String[] args) {
	
	int a[]={1,2,3,4,5,6,7,8,9};
	/*Object[] o=new Object[a.length];
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]%3==0)
		{
			o[i]="java";
		}
		else
		o[i]=a[i];
	}
	
	System.out.println(Arrays.toString(o));*/
	
	
List al=new ArrayList<>();
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]%3==0)
		{
			al.add("java");
		}
		else
			
		   al.add(a[i]);
	}
	System.out.println(al);
}
}
