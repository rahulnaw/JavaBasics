package pack1;

public class Temprature {
	

public static void main(String args[])
 { 
double c=4	;
double a=0;

 a=ctof(c);

 System.out.println("temprature in faranite is "+a);
 a=ftoc(a);
  System.out.println("temprature in celcius is "+a);

  System.out.println(ftoc(a));
  }


static double ctof(double x)
	{
	double z;
	
	 z=(x*1.8)+32;
	 return z;

  }

  static double ftoc(double x)
	{
	double z;
	

z=(x-32)/1.8;

	 return z;

  }

}
