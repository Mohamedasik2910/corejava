package returntype;

public class Return {

	public static void main(String[] args) {
		int d=add();
		System.out.println(d+10);
		//add();
	}
	public static int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return a;
	}

}
