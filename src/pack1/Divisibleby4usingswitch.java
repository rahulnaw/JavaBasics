package pack1;

public class Divisibleby4usingswitch {
	
	public static void main(String[] args)
	{
	int i=490;
	int a=i%100;//
			
	
	switch (a%4)
	{
	case 0:
		System.out.println("can be divided by 4");
		break;
	
	case 1:
		System.out.println("can not be divided by 4 ");
		break;
	
		default: 
		System.out.println("can not be divided by 4 ");
	}
	
	
	
	}
}
