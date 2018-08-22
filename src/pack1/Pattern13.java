/*
 1 2 3 4 5 
  2 3 4 5 
    3 4 5 
      4 5 
        5 
using only 2 for lloop and if statement
 */
package pack1;

public class Pattern13 {
	public static void main(String[] args)
	{
		int i,j,n=5;
	
						for (i=1;i<=n;i++)
							{
							for (j=1;j<=n;j++)	
								{
		     						if (j<i)
				    				System.out.print(" ");
				    				else 
				    				System.out.print(j);
				    				}
								System.out.println();
		    			}
		      }
	}


