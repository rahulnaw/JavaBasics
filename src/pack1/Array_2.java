package pack1;

import java.util.Scanner;

public class Array_2 {

public static void main(String[] args)
	
	{
		int [] age=new int[3];
		String [] name=new String[3];
		String [] color=new String[3];
		for (int i = 0; i<3; i++) 
			{
			Scanner s= new Scanner (System.in);
			System.out.println("tell ur name ");
			name[i] =s.nextLine();
			System.out.println("my mane is "+ name[i]);
			
			
			System.out.println("tell ur age ");
			age[i] =s.nextInt();
			System.out.println("my mane is "+ age[i]);
			
			System.out.println("fav color ");
			color[i] =s.nextLine();
			System.out.println("my mane is "+ color[i]);
			
			}	
		}		

}
