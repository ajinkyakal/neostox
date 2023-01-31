package collection;

import java.util.TreeSet;

public class Treesetstudy {

	public static void main(String[] args) 
	{
  
		TreeSet<Object>t=new TreeSet<>();
		
		 t.add(1);
	     t.add(2);
		 t.add(2);
		 t.add(4);
		 t.add(4);
		 t.add(5);
		 
		 System.out.println(t);
		 
		 t.add(7);
		 
		 System.out.println(t);
		 
		 t.add(0);
		 
		 System.out.println(t);
		
		 System.out.println(t.first());
		 
		 System.out.println(t.last());
		 
		 System.out.println(t.ceiling(3));
		 
		 System.out.println(t.floor(8));
		 System.out.println("_________________________");
		 System.out.println(t.higher(3));

		 System.out.println(t.lower(3));

	}

}
