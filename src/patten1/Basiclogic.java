package patten1;

public class Basiclogic 
{

	public static void main(String[] args) 
	{
		// *
		// *
		// *
		// *
		// *
		for(int i=1;i<=5;i++)
		{
		System.out.print("* ");
		}
		
		
		for(int i=1;i<=5;i++)
		{
		System.out.println("*");
		}
		//* * * * *
		
		
		
		
		
		for(int row=1;row<=5;row++)//1,2,3,4,5, no 6
		{
		//inner for loop--> columns
		for(int column=1;column<=5;column++)//1,2,3,4,5, no 6
		{
		System.out.print("* ");
		}
		System.out.println();
		}
		
	}

}
