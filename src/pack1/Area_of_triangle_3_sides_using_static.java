//use this for using pre-defined mathemantical functions      importjava.lang.M;  or import java.lang.*;


package pack1;


import java.lang.*;
public class Area_of_triangle_3_sides_using_static {
	
		int a=5,b=6,c=7;
		

		public static void main(String args[])
		 { 
			
		//int a=5,b=6,c=7;   try this are  remove line 5     try to access is directly from outside main
		  }

		static void area3sidesoftriangle(int x, int y, int z)
			{

			int s=0;
		double ar=0;

		s=(x+y+z)/2;
		System.out.println("sum of all sides is divided by two is "+s);


		ar= Math.sqrt((s*(s-x)*(s-y)*(s-z)));

		 System.out.println("area is "+ar);


		}

		 static 
			{

			 Area_of_triangle_3_sides_using_static a1 = new Area_of_triangle_3_sides_using_static();

		area3sidesoftriangle(a1.a,a1.b,a1.c);

			}

}
