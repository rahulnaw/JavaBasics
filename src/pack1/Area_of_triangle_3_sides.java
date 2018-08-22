package pack1;

public class Area_of_triangle_3_sides {
	
	public static void main(String args[])
	 { 
	int a=5,b=6,c=7,s=0;
	double ar=0;


	s=(a+b+c)/2;
	System.out.println("sum of all sides is "+s);


	ar= Math.sqrt((s*(s-a)*(s-b)*(s-c)));

	        System.out.println("area is "+ar);





	  }

}
