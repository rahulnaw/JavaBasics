/*
1 2 3 4 5 
  2 3 4 5 
    3 4 5 
      4 5 
        5 
        pattern 13 is also same for this but with only 2 for loop
 */

package pack1;

public class Pattern12 {

	public static void main(String[] args) 
	{
		int i,j,k,a=1;
		for (i = 1; i <=5; i++) 
		{
			
			for (k=2;k<=i;k++)
		{
			System.out.print(" "+" ");
		}
			
	
			for (j=5; j>=i; j--) 
			{
			
				System.out.print(a+" ");	
				a++;	
				
		}
		
				
			a=1; 
			a=a+i;
			System.out.println();
		
	}
		
	}

}
