package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) 
	{
		HashSet<Object>hs= new HashSet<>();
		hs.add("Pune");
		hs.add(123);
		hs.add('A');
		hs.add(true);
		hs.add(22.11f);
		hs.add(null);
		hs.add(null);
		hs.add("Pune");
		System.out.println(hs);
		
		//we cant use for loop in set--> we dont get method storage type index
		
	    hs.remove("Pune");
		
		System.out.println(hs);
		
		System.out.println("=========for each===============");
		
		for(Object h:hs)
		{
		System.out.println(h);
		}
		
		System.out.println("=======iterator========");
		
		Iterator<Object> it = hs.iterator();
		
		while(it.hasNext())
		{
		System.out.println(it.next());
		}




	}

}
