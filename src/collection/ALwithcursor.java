package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ALwithcursor {

	public static void main(String[] args) 
	
	{
		ArrayList<Object> AK= new ArrayList<>();
		AK.add("ajinkya");
		AK.add("devchand");
		AK.add("kale");
		AK.add(94);
		AK.add('M');
		AK.add(5.5f);
		AK.add(null);
		AK.add(true);

		System.out.println(AK);
		
		// traversing using for loop
		System.out.println("==========using for loop==============");
		
		for(int i=0;i<=AK.size()-1;i++)
		{
			System.out.println(AK.get(i));
		}
		System.out.println("===========using iterator==============");
		
		Iterator<Object> it = AK.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===========using for each============");
		
		for( Object aj:AK)
		{
			System.out.println(aj);
		}

	}

}
