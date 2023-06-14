package methods;

public class methodoverloading {

	public static void main(String[] args) 
	{
		add("Welcome");
		add("Welcome", "Asik");
		test("Java","Test");
		add(100);
	}
	public static void add(String s)
	{
	System.out.println(s);	
	}
	public static void add(String S, String S1)
	{
		System.out.println(S+S1);	
	}
 public static void add(int a)
{
	System.out.println(a);
}
 public static void test(String s, String s1)
 {
	 System.out.println(s+s1);
 }
}


