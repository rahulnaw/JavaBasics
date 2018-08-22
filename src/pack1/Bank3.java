//wap to store the initial amout by a customer giving them  500 rs after first txn 
//Also write a function to return the current balance of that customer

package pack1;

public class Bank3 {
int bal;
int add=500;

	
	public static void main(String args[])
	 {
		
		boolean b=true;
		
		
		Bank3 a1= new Bank3(); 
		a1.bal=10000;
		a1.bal=a1.bal+1000;
		
	if(b==true) 
	{
	a1.bal=a1.add+a1.bal;
				System.out.println("balance is"+a1.bal);
				b = false;
	}			
		a1.bal=a1.bal+2000;
		
		System.out.println("balance is"+a1.bal);
					
}

}