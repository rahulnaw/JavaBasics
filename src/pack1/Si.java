//initialize 2 objects to hold 5000 and 1000. suppose object 1 has kept it in a bank giving 20% interest and object 2 has kept it in bank giving 10% interest
//define variables and functions to get data(amount) after 2 years and 3 years respectively. also write a function to display the balance wherever needed.

package pack1;

public class Si 
{
	double amount;
	float rate;
	int time;
	double SI;
	
	    Si(long amount)
	 {
	    this.amount=amount;
	 }
				
	    public static void main(String args[])
	    { 
		Si a1= new Si(5000);
		Si a2= new Si(1000);
		a1.display(a1.amount);
		a2.display(a2.amount);
		a1.rate=20;
		a1.time=2;
		a2.rate=10;
		a2.time=3;
		
   	 	a1.SI=a1.simplein(a1.amount,a1.rate,a1.time);
   	 	a1.display(a1.amount);
	 
   	 	a2.SI=a2.simplein(a2.amount,a2.rate,a2.time);
   	 	a2.display(a2.amount);
     
 // 	a1.amount=a1.amount+2000;                                    // if 2000 is added to the a1's amount 
 //		a1.SI=a1.simplein(a1.amount,a1.rate,a1.time);               // output after checking si after adding 2000 to a1's amount 
	    }
	
 double simplein(double amount,float rate,int time)
	{
	 double s=0;
	 s=((amount*rate*time)/100)+amount;
	 this.amount=s;
	 System.out.println("Amount after Simple intrest is:"+s);
	return amount;
   }
 
void display(double amount)
   {
  System.out.println("ur balance is:"+amount);
   }

}
