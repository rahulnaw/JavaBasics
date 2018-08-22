/*
1 4 7 10 13
1 5 9 13 17
1 6 11 16 21
*/
package pack1;
public class Pattern9 {

public static void main(String[] args) 
{
		int a=1,b=3;
		for (int i = 1; i <=3; i++) 
		{
		for (int j=1; j<=5; j++) 
			{	System.out.print(a+" ");	
			    a=a+b;	
			}
		a=1;
		b++;
		System.out.println();
		}
}
}

/*other logic using switch 
 
	public static void main(String[] args) 
	{
		int i,j,a=1;
			for (i = 1; i <=3; i++) 
		{
				for (j=1; j<=5; j++) 
			{
			    System.out.print(a+" ");	
				switch (i)
				{
				case 1:
				a=a+3; 
					 break;
				case 2:
				a=a+4; break;
				case 3:
				a=a+5; break;}
			}
			a=1;
			System.out.println();
		 }
}
}*/
