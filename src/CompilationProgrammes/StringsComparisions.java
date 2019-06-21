package CompilationProgrammes;

public class StringsComparisions {

	public static void main(String[] args) {
		
		/*String s1="java";
		//s1=s1.concat("knowledge");
		s1=s1+"knowledge";
		System.out.println(s1);*/
		//System.out.println("---------------");
		
		/*String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);*/
		//System.out.println("--------------------");
		
		/*String s3="abc";
		String s4=new String("abc");
		
		s3 = s3.intern();
		s4=s4.intern();
		System.out.println(s3==(s4));*/
		
		String s="venkateseh";
		
		int i = s.indexOf('e',s.indexOf('e')+1 );
		System.out.println(i);
		 int ii = s.indexOf('e',(s.indexOf('e', s.indexOf('e')) )+1);
		 System.out.println(ii);
	}
}
