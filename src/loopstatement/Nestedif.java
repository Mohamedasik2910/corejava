package loopstatement;

public class Nestedif {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a>b)
		{
			if(b>c)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("C Greater");
			}
		}

	}

}
