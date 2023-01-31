package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy 
{

	public static void main(String[] args) 
	{
		Vector<Object> Ak = new Vector<>();
		
		Ak.add("ajinkya");
		Ak.add("devchand");
		Ak.add("kale");
		Ak.add('M');
		Ak.add(5.5f);
		Ak.add(65);
		Ak.add(null);
		Ak.add(null);
		Ak.add(1234567890);
		Ak.add("ajinkya");
		Ak.add("ajinkya");
		
		System.out.println(Ak.capacity());
		
		System.out.println(Ak.size());
		
		System.out.println(Ak);
		
		Ak.add(2,"Pranjal");
		System.out.println(Ak);
		System.out.println("==================================");
		
		//Ak.clear();
		//System.out.println(Ak);
		
		System.out.println("==================================");
		

		System.out.println(Ak.elementAt(8));
		System.out.println(Ak.get(8));
		
		System.out.println("==================================");
		
		System.out.println(Ak.firstElement());
		
		System.out.println("==================================");
		
		System.out.println(Ak.indexOf("ajinkya"));
		
		System.out.println("==================================");
		
		System.out.println(Ak.lastElement());
		
		System.out.println("==================================");
		
        System.out.println(Ak.remove(3));
        
        System.out.println(Ak);
        
        System.out.println("==================================");
        
        Ak.set(2, "kale");
        System.out.println(Ak);
        
        System.out.println("traversing trough vector");
        
        System.out.println("==========using for loop==============");
        
        for(int i=0;i<=Ak.size()-1;i++) 
        {
        	System.out.println(Ak.get(i));
        	
        }
        
        System.out.println("===========using for each============");
        
        for(Object aj:Ak)
        {
        	System.out.println(aj);
        }
    	System.out.println("===========using iterator==============");
     Iterator<Object> it = Ak.iterator();
     
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
		ListIterator<Object> Li = Ak.listIterator();
		while(Li.hasNext()) 
		{
			System.out.println(Li.next());
		}
		System.out.println("===========enumeration============");
		
		Enumeration<Object> En = Ak.elements();
		
		while(En.hasMoreElements())
		{
			System.out.println(En.nextElement());
		}
				
		
	
		

	}

}
