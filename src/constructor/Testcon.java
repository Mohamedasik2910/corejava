package constructor;

public class Testcon {

	public static void main(String[] args) 
	{
         Testcon t=new Testcon();
         Testcon t1=new Testcon("Java","Basic");
         Testcon t2=new Testcon(10,20);
         Testcon t3=new Testcon("Asik",100);
	}
	public Testcon()
	{
		System.out.println("Empty constructor");
	
	}
	public Testcon(String s, String s1)
	{
		System.out.println(s+s1);
		
	}
	public Testcon(int a, int b)
	{
		int c=a+b;
		System.out.println("The Value is "+c);
	}
  public Testcon(String s, int x)
{
	System.out.println(s+x);
}

}
