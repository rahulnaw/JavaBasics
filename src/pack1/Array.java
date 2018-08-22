package pack1;

import java.util.Scanner;

public class Array {


	public static void main(String[] args)
	
	{
		
		String [] name=new String[5];
		
		for (int i = 1; i<=3; i++) 
			{
			Scanner s= new Scanner (System.in);
			System.out.println("tell ur name ");
			name[i] =s.next();
			System.out.println("my mane is "+ name[i]);
			}	
		
						}		


}
