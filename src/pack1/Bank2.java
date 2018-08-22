//same program as bank only 20% reduced
package pack1;

public class Bank2 {
			
		int bal;
		
		Bank2(int bal)  
		{
			this.bal=bal+100;
		}
			
	public static void main(String args[])
	 { 
		Bank2 a1= new Bank2(300); 
		a1.displaybalance(a1.bal);
		a1.bal=(a1.bal-(a1.bal*20)/100);//finding 20% and reducing from main balance
		a1.displaybalance(a1.bal);
	
			
     	Bank2 a2= new Bank2(400);
		a2.displaybalance(a2.bal);
		a2.bal=(a2.bal-(a2.bal*20)/100);//finding 20% and reducing from main balance
		a2.displaybalance(a2.bal);
	 }

	void displaybalance(int x)//it is kept as non static because if we keep static then last values will be over rided. we can use static also but then it will be only 1 function for whole program.
		{
		  System.out.println("updated balance is"+x);

		}
}
