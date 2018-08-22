package pack1;

import java.util.Scanner;

public class Scanner_3 {

	

	public static void main(String[] args)
	
	{
		String name;
		int lucky_no,age;
		String m;
		long pno;
		char yn;
		
		for (int i = 1; i<=1; i++) 
		{
			Scanner s= new Scanner(System.in);
			
			System.out.println("tell ur name ");
			name =s.next();
			System.out.println("my mane is "+ name);
			
			System.out.println("enter lucky no ");
				lucky_no=s.nextInt();
			System.out.println("lucky no is "+ lucky_no);
	
			System.out.println("enter age ");
			    age=s.nextInt();
			System.out.println("age is "+ age);
			
			System.out.println("enter martial status m or u ");
			m =s.next();
			System.out.println("martial status is "+ m);
			
			System.out.println("enter phone no ");
			pno=s.nextLong();
		    System.out.println("pno is "+ pno);
		    
		System.out.println("enter y or n no ");
			yn=s.next().charAt(0);
		    System.out.println("u entered "+ yn);  
		    
		    s.close();
		}	
		
		
		
			}
	
}
