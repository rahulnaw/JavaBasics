/*
	 1
	 2 3
	 4  5  6
	 7  8  91 0
	 10 11 12 14 15
*/

package pack1;
public class Pattern8 {

	public static void main(String[] args) 
	{
		int i,j,a=1;
		for (i = 1; i <=5; i++) 
		{
			for (j=1; j<=i; j++) 
			{
				System.out.print(a+" ");	
				a++;     
			
			}
			     System.out.println();
		}
	}
}
