/*
&&&&&1
&&&&12
&&&123
&&1234
&12345
 */

package pack1;

public class Pattern14 {

static int a=1;	

	public static void main(String[] args)
	{
		int i,j;
		int n=5;
	
		for (i=n;i>=1;i--)
				{
					a=1;
    					for (j=1;j<=n;j++)	
    				{
    						
    				       	if(j<i)
    				 	System.out.print("*");
    				   
    				       if(j>=i)
    				       {
    				    	
    				System.out.print(a);
    				a++;
    				       }
    				   	
    				}
   				System.out.println();	
				}

	}}		
    		      
    	

