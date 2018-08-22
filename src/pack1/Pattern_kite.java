package pack1;

public class Pattern_kite {
	
			 public static void main (String[]args)
			 {

			   int n, i, j, space;
			   //   System.out.print ("Enter the number of rows: ");
			     n = 5;
			     
			     /** Pyramid */
			     space = n - 1; 
			   for (j = 1; j <= n; j++) 
			     {
			for (i = 1; i <= space; i++) 
			 {
			   System.out.print (" "); 
			 }
			space--;
			for (i = 1; i <= 2 * j - 1; i++) 
			 {
			     if(i == 1 || i == 2 * j - 1)
			     {	System.out.print ("*"); }
			     
			     else { System.out.print(" "); }
			 }
			
			System.out.println ("");
			     }
			     
			     /** Reverse Pyramid */
			   space = 1;
			   for (j = 1; j <= n - 1; j++)
			     {
			for (i = 1; i <= space; i++)
			 {
			   System.out.print (" ");
			 }
			space++;
			for (i = 1; i <= 2 * (n - j) - 1; i++)
			 {
			     if (i == 1 || i == 2 * (n-j) - 1) 
			     {
			    	 System.out.print ("*"); 
			     }
			     
			     else
			     {
			    	 System.out.print(" "); 
			    	 }
			 }
			System.out.println ("");
			     }
			 }
		
	}


			
