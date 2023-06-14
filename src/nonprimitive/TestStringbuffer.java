package nonprimitive;

public class TestStringbuffer {

	public static void main(String[] args) {
		StringBuffer S=new StringBuffer("Welcome to Java");
		System.out.println(S.insert(11, "Core"));
		System.out.println(S.replace(11, 15, "Base"));
		System.out.println(S.delete(11, 15));
		System.out.println(S.reverse());
		System.out.println(S.capacity());
		
		

	}

}
