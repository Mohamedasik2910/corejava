package array;

public class Singledimensionalarray {

	public static void main(String[] args) {
	
	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	int b[]=a.clone();
	System.out.println(b.length);
	for(int i=1;i<b.length;i++)
{
		System.out.println(b[i]);
	} 
	

	}

}
 