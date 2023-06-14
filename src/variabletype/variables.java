package variabletype;

public class variables {
public int c;
public static int d;

	public static void main(String[] args) {
		variables z=new variables();
		variables y=new variables();
		y.add();
		z.c=50;
		d=100;
		System.out.println(d);
		System.out.println(z);
		

	}
public void add()
{
	d=90;
	c=100;
	System.out.println(d);
}
}

