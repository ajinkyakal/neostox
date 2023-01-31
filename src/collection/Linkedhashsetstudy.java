package collection;

import java.util.LinkedHashSet;

public class Linkedhashsetstudy {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lh= new LinkedHashSet<>();
		
		lh.add("Pune");
		lh.add("Mumbai");
		lh.add("Nagpur");
		lh.add("Thane");
		lh.add("Pune");
		lh.add(null);
		lh.add(null);
		lh.add("Delhi");
		System.out.println(lh);
		
		System.out.println(lh.size());
		
		

	}

}
