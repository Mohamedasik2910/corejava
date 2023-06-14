package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Testclass {

	public static void main(String[] args) {
		//ArrayList<String>data=new ArrayList<String>();
		List<String>data=new ArrayList<String>();
		//List<String>data=new ArrayList<String>();
		data.add("Java");
		data.add("Array");
		data.add("List");
		data.add("Concept");
		data.set(3, "Example");
		//data.remove(3);
		
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
			System.out.println((data.get(j)));
		}
		System.out.println("---For Each Loop---");
		for (String str : data) {
			System.out.println(str);
			
		}
		System.out.println("----Iterator---");

		Iterator<String>it=data.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
