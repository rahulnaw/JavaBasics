package pack1;

import java.util.Scanner;

public class Scanner2 {

	
	public static void main(String[] args)
	
	{
		String name;
		int age;
		for (int i = 1; i<=3; i++) 
		{
			Scanner s= new Scanner (System.in);
			System.out.println("tell ur name ");
			name =s.next();
			System.out.println("my mane is "+ name);
			
			System.out.println("person  age ");
	
		    age=s.nextInt();
			System.out.println("age is "+ age);
		}	
		
		
		
			}
}
