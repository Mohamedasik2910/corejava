package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String>data=new HashSet<String>();
		data.add("Java");
		data.add("Set");
		data.add("Basic");
		data.add("Course");
		//System.out.println(data);
System.out.println("----For Each Loop----");
for (String str : data) 
{
System.out.println(str);	
}
System.out.println("----Iterator---");
{
	Iterator<String>it=data.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}

	}

}
