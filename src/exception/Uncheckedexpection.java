package exception;

public class Uncheckedexpection {

	public static void main(String[] args) {
		try
		{
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[4]);
		}
		catch(Exception e)
		{
			System.err.println("Something went Wrong");
		}
		
	}

}
