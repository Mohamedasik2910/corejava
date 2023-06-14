package collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Testlist {

	public static void main(String[] args) {
		List<String>data=new ArrayList<String>();
		data.add("Methods");
		data.add("Method Overloading");
		data.add("Method Overriding");
		data.add("Method Arguments");
		//System.out.println(data.size());
		System.out.println("---While Loop---");
		int i=0;
		while(i<data.size())
		{
			System.out.println(data.get(i));
			i++;
		}
		
System.out.println("---For Loop---");
for(int j=0;j<data.size();j++)
{
	System.out.println(data.get(j));

}
System.out.println("---For Each---");
for (String str : data) 
{
System.out.println(str);	
}
System.out.println("---Iterator---");
//while(it.hasNext())
//{
	//System.out.println(it.next());
//}
System.out.println("---Do While---");
int z=0;
do
{
	System.out.println(data.get(z));
	z++;
}while(z<data.size());
	}

}
