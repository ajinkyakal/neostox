package collection;

import java.util.ArrayList;

public class Arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList AL=new ArrayList();
		
		AL.add("ajinky kale");
		AL.add("ajinky kale");
		AL.add(1234567);
		AL.add(null);
		AL.add(null);
		AL.add('A');
		
		System.out.println(AL);
		
		ArrayList<String> al=new ArrayList<>();
		
		System.out.println(al.add("Hi"));
		al.add("ajinkya kale");
		al.add("GM");
		al.add("1235");
		System.out.println(al);
		System.out.println("-------------------------------------------------------------");
		
		//al.clear();   //clear all collection
		//System.out.println(al);
		
		System.out.println("-------------------------------------------------------------");
		Object al2=al.clone();
		
		System.out.println(al);
		System.out.println(al2);
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(al.contains("GM"));
		System.out.println(al.contains("M"));
		System.out.println("-------------------------------------------------------------");
		
		String ele=al.get(2);
		System.out.println(ele);
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(al.indexOf("GM"));
		
		System.out.println("-------------------------------------------------------------");
		al.set(0,"Pranjal");
		System.out.println(al);
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(al.size());
		System.out.println("-------------------------------------------------------------");
		
		
		al.add(1, "jinkya");  // right shift--> when you are inserting element in between arraylist
        System.out.println(al);
        System.out.println("-------------------------------------------------------------");
        
        
        al.remove(1);
        System.out.println(al); //left shit--> when you try to remove/delete from in between of arraylist

        System.out.println("-------------------------------------------------------------");
        
        
       
        
        
        
	}
	

}
