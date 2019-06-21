package CompilationProgrammes;

public class B {
	B b=new B();
	public int show()
	{
		return (true?null:1);
		
	}
public static void main(String[] args) {

	B b=new B();
	
	int show = b.show();
	System.out.println(show);
}
}
