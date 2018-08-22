/*u r a bank  manager  then create accounts to all the people who have registered with either 
 1-name 
 2-name email
 3-email
 4 mobile no
 allot them account no starting from 102060
  Note:  [ two consecutive no should have a minimum difference of 6000 between them  ]        */

package pack1;

public class Banking 
{
	static int x=102060;
	
	String name;
	String email;
	long mobile_no;
	int account_no;
	
	Banking(String name)
	{
	this.name=name;
	this.mobile_no=mobile_no;	
	this.email=email;
	this.account_no=x;
		x=x+6000;
	}

	
	Banking(String name,String email )
	{
		this.name=name;
		this.mobile_no=mobile_no;	
		this.email=email;
		this.account_no=x;
			x=x+6000;
	}
	
	Banking(long mobile_no)
	{
		this.name=name;
		this.mobile_no=mobile_no;	
		this.email=email;
		this.account_no=x;
			x=x+6000;
	}
	
	public static void main(String[] args) 
	{
		Banking ac1=new Banking("rahul");
		Banking ac2=new Banking("tony","tony@gmail.com");
		Banking ac3=new Banking("","erett@gmail.com");
		Banking ac4=new Banking(987654389l);
		
		ac1.display(ac1.name,ac1.mobile_no,ac1.email,ac1.account_no);
		ac2.display(ac2.name,ac2.mobile_no,ac2.email,ac2.account_no);
		ac3.display(ac3.name,ac3.mobile_no,ac3.email,ac3.account_no);
		ac4.display(ac4.name,ac4.mobile_no,ac4.email,ac4.account_no);
	}
	
void display(String name,long mobile_no,String email,int account_no)
{
  System.out.println("name is: "+name);
  System.out.println("mobileno is : "+mobile_no);
  System.out.println("email is : "+email);
  System.out.println("account_no is : "+account_no);
  System.out.println();
}
}
