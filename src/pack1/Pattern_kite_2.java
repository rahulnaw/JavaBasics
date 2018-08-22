package pack1;

public class Pattern_kite_2 
{

	public static void main(String[] args)
	{
		int i,j,n=6;
		
		for (i=1;i<=n;i++)
			{
			for (j=1;j<=n;j++)	
				{
						if (	i+j==(n/2)+2	||	i-j==n/2	||	j-i==n/2	||	i+j==(n*2)-(n/2	))
		    				{System.out.print("*");
		    			
    				}
    				else 
    				System.out.print(" ");
  
				}
				System.out.println();
		}
}}




