package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Testmap1 {

	public static void main(String[] args) {
		Map<Integer, String>data=new HashMap<Integer, String>();
		data.put(1, "Honda");
		data.put(2, "Hero");
		data.put(3, "Bajaj");
		data.put(4, "Suzuki");
		data.put(5,"Yamaha");
		System.out.println(data.size());
		System.out.println("---For Each---");
		data.forEach((K,V)->System.out.println("The Value of Integer Value is:"+K+"\tThe Value of String is:"+V));
System.out.println("---Iterator---");
Iterator<Integer>it=data.keySet().iterator();
{
	while(it.hasNext())
	{
		//System.out.println(it.next());
		System.out.println(data.get(it.next()));
	}
}
Iterator<Entry<Integer, String>>is=data.entrySet().iterator();
{
	while(is.hasNext())
	{
		System.out.println(is.next());
	}
}
	}

}
