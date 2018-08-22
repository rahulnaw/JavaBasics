package pack1;

public class Constructor {
	
	
	Constructor()      //1st constructor 
	{
		System.out.println("c1");
	}
	
	Constructor(int x)   //2nd constructor with diff args
	{
		System.out.println("c2");
	}
	
	Constructor(int x ,boolean y)   //3rd constructor with diff args
	{
		System.out.println("c3");
	}
		
	public static void main (String args[])
	{
		Constructor a1= new Constructor();  // caling constructor 1
		//if i want to call 2nd constctor i will create new object
		
		Constructor a2= new Constructor(5);// caling constructor 2
		//if i want to call 3rd constctor i will create new object
		
		Constructor a3= new Constructor(5,false);// caling constructor 3
		
				
		System.out.println("main function");
		}
	

}
