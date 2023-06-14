package nonprimitive;

public class Teststringbuilder {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Welcome to Java");
		System.out.println(s);
		System.out.println(s.append(" Class"));
		System.out.println(s.insert(10, " Core"));
		System.out.println(s.replace(10, 15, " Base"));
		System.out.println(s.delete(10, 15));
		System.out.println(s.reverse());
		System.out.println(s.capacity());
	}

}
