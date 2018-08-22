package pack1;

public class Area_of_5_circle_usig_object 
{
	static final double pi=3.14;
	int x, y, z,c, d;

	public static void main(String args[])
	 { 

	double a=0;

	Area_of_5_circle_usig_object a1=new Area_of_5_circle_usig_object();
	a1.x=1;
	a1.y=2;
	a1.z=3;
	a1.c=4;
	a1.d=5;



	 a=area(a1.x);
	 System.out.println("area of 1st circle with radius 1 is "+a);

	 a=area(a1.y);
	 System.out.println("area of 2nd circle with radius 2 is "+a);

	 a=area(a1.z);
	 System.out.println("area of 3rd circle with radius 3 is "+a);
	 
	 a=area(a1.c);
	System.out.println("area of 4th circle with radius 4 is "+a);

	a=area(a1.d);
	System.out.println("area of 5th circle with radius 5 is "+a);

	}


	static double area(int x)
		{
		double z;

		z=x*x*pi;
		return z;

	  }
}
