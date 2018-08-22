//wap to store the initial amount by a customer giving them  500 rs after first txn 
//Also write a function to return the current balance of that customer

package pack1;

public class bank_3 {
	double bal;
	boolean first=true;
	
	bank_3(double bal)
	{
		this.bal=bal;
	}
		
	public static void main(String args[])
	{
		bank_3 b1= new bank_3(10000);
		System.out.println("initial balance is:"+b1.bal);
		b1.add(1000);
		System.out.println("balance after adding 1000 is:"+b1.bal);
		b1.add(2000);
		System.out.println("after adding 2000 is: "+b1.bal);
	}
	
	
	void add(int x)
	{
		if (first==true)
		{
			this.bal=this.bal+x+500;
			first=false;
		}
		else 
		{
			this.bal=this.bal+x;
		}		
		
	}
	

}
