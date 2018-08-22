

package pack1;
import java.lang.Math;



public class Tes {
	
	public static int x = 4;
		 public static void main (String[]args)
		 {

		   int n, i, j, space;
		   //   System.out.print ("Enter the number of rows: ");
		     n = 3;
		     
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
		     if (i == 1 || i == 2 * (n-j) - 1) {	System.out.print ("*"); }
		     else { System.out.print(" "); }
		 }
		System.out.println ("");
		     }
		 }
	
}






/**
package pack1;
public class Tes 
{
	
			public static void main(String[] args)
			{
				   for(int i = 5; i > -5; i--)
				      {
				         for(int j = 0; j < i; j++)
				         {
				            System.out.print(" ");
				         }
				         for(int j = 0; j >= i; j--)
				         {
				            System.out.print(" ");
				         }
				         System.out.println("*");
				      }
				   
		      }
		   }



11	12	13	14	15
21	22	23	24	25
31	32	33	34	35
41	42	43	44	45
51	52	53	54	55



for 7


package pack1;

public class pattern16 {

	public static void main(String[] args)
	{
		int i,j,n=7;
				
		for (i=1;i<=n;i++)
			{
			for (j=1;j<=n;j++)	
				{
						if (i+j==n-2)
		    			{
						System.out.print(i+"");
						System.out.print(j+" ");
		    			}
						
						if (i+j==n+4)
	    				{
						System.out.print(i+"");
						System.out.print(j+" ");
	    				}
						
						if (i-j==n-4)
	    				{
						System.out.print(i);
						System.out.print(j+" ");
	    				}
						if (j-i==n-4)
	    				{
						System.out.print(i);
						System.out.print(j+" ");
	    				}
						
						
							
						
    				else 
    				System.out.print(" ");
					  
				}
				System.out.println();
		}
}
}





		   
		   */


