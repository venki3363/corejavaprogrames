package CompilationProgrammes;

class BaseClass
{
	public String method()
	{
		return "i am from base class";
	}
}
public class Inhertiance extends BaseClass{

	public String method(int m)
	{
		return "i am from child class";
	}
	public static void main(String[] args)
	{
		BaseClass b=new BaseClass();
		
		String method = b.method();
		System.out.println("method");
		//Inhertiance b1=new BaseClass();
		
		
		
    }
}
