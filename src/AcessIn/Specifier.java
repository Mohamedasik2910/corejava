package AcessIn;

public class Specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test_publicaccess();
		test_privateaccess();
		test_protectedacess();
		default_access();

	}
	public static void test_publicaccess()
	
	{
		System.out.println("Public access");
	}
	private static void test_privateaccess()
	{
		System.out.println("Private accesss");
	}
	protected static void test_protectedacess()
	{
		System.out.println("Proteced access");
	}
	static void default_access()
	{
		System.out.println("Default Access");
	}
}

