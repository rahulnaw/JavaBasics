package pack1;

public class This {
	
	double x;
	
	This(int x)
	{
		this.x=x;      //blue x means the member variable x is assignes value by black x that have value 10000 being passed by line 11. 
		               //now blue x (member variable ) has value 1000
	}
	public static void main(String[] args)
	{
		This a1= new This(10000);
		
		System.out.println(a1.x);
		
	}

}
