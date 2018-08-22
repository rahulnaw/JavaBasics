package pack1;

public class Area_of_5_circle {
	
	static final double pi=3.14;

	public static void main(String args[])
	 { 
	int x=1, y=2, z=3, c=4, d=5;
	double a=0;

	 a=area(x);
	 System.out.println("area of 1st circle with radius 1 is "+a);

	 a=area(y);
	 System.out.println("area of 2nd circle with radius 2 is "+a);

	 a=area(z);
	 System.out.println("area of 3rd circle with radius 3 is "+a);
	 
	 a=area(c);
	System.out.println("area of 4th circle with radius 4 is "+a);

	a=area(d);
	System.out.println("area of 5th circle with radius 5 is "+a);

	}


	static double area(int x)
		{
		double z;

		z=x*x*pi;
		return z;

	  }


}
