package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Testmap {

	public static void main(String[] args) {
		Map<Integer, String>data=new HashMap<Integer, String>();
		data.put(10, "Java");
		data.put(20, "Php");
		data.put(30, "Phyton");
		data.put(40, "C++");
		//System.out.println(data.get(20));
		
		System.out.println("\t---For Each Loop---");
		
		data.forEach((K,V)->System.out.println("The Integer Value:"+K+"\tThe String Value:"+V));
		System.out.println("\n\t---Iterator---");
		Iterator<Integer>ks=data.keySet().iterator();
		while(ks.hasNext())
		{
			//System.out.println(ks.next());
			System.out.println(data.get(ks.next()));
		}
		System.out.println("\n\t----Entry Set----");
		{
			Iterator<Entry<Integer, String>>es=data.entrySet().iterator();
			{
				while(es.hasNext())
				{
					System.out.println(es.next());
				}
				
			}
			
		}
		

	}

}
