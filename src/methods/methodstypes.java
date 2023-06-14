package methods;

public class methodstypes {

	public static void main(String[] args) {
		
add();
methodstypes m=new methodstypes();
m.mul();
test();

	}
	public static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("The Add Result is:" +c);
	}
public void mul()
{
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println("The Mul Result is:" +c);
	div();
	mod();
}

public static void div()
{
	int a=100;
	int b=20;
	int c=a/b;
	System.out.println("The Div Result is:" +c);
}
public void mod()
{
	int a=105;
	int b=20;
	int c=a%b;
	System.out.println("The Mod Result is:" +c);	
}
public static void test()
{
	int a=200;
	int b=100;
	int c=a+b;
	System.out.println("the restul is: "+c);
}

}
