package CompilationProgrammes;

public class Test2 extends Test1
{
	
static int c=8;
static void m1()
{
	System.out.println("static child m1 method");
}
public static void main(String[] args) {
	Test2 t=new Test2();
	
	System.out.println(t.a);
	t.m1();
	m1();
}
}
