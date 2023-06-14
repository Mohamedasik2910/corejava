package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Testset1 {

	public static void main(String[] args) {
		Set<Integer>data=new HashSet<Integer>();
		data.add(1);
		data.add(3);
		data.add(7);
		data.add(8);
		data.add(10);
		System.out.println("\t\nFor Each");
		/*for (Integer ins : data) {
			System.out.println(ins);
			
		}
		System.out.println("\t\nIterator");
		Iterator<Integer>ks=data.iterator();
		while(ks.hasNext())
		{
			System.out.println(ks.next());
		}*/
		for(int i=0;i<=10;i++)
		{
			if(data.contains(i))
			{
				System.out.println(i+"\tValue Is Present");
		
			}
			else
			{
				System.out.println(i+"\tValue Is Not Present");
			}
		}
		
		

	}

}
