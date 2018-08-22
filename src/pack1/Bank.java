//wap to store the initial amount deposite by a customer giving them 100 rs as joining bonus . 
//Also write a function fo return the current balance od=f that customer note :use constructor and this keyword

package pack1;

public class Bank {
	
	int bal;
	
	Bank(int bal)  
	{
		this.bal=bal+100;//here we are adding 100 rs as bonus at start only
	}
		
public static void main(String args[])
 { 
	Bank a1= new Bank(300); 
	a1.displaybalance(a1.bal);
		
	Bank a2= new Bank(400);
	a2.displaybalance(a2.bal);
 }

 void displaybalance(int x)//it is kept as non static because if we keep static then last values will be over rided. we can use static also but then it will be only 1 function for whole program.
	{
	 System.out.println("deposited balance is"+(x-100));
	  System.out.println("updated balance is"+x);

	}
}
