package CompilationProgrammes;
class Demo{
	 void m1()
	{
		System.out.println("m1 parent method");
	}
	 void m2()
		{
		 System.out.println("m2 parent method");
		}
	 private void m3()
	 {
		System.out.println("private m3");
	 }
}


public class Test extends Demo {
	void m2()
	{
		super.m2();
	 System.out.println("m2 child method");
	}
	
	
	public static void main(String[] args)
	{
		Demo t=new Test();
		t.m1();
		t.m2();
		
		
	}
}
