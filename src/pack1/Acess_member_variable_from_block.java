package pack1;

public class Acess_member_variable_from_block {
	  static int i=55; //try for non static
	  int j=6;
	 

		
	 public static void main(String args[])

	  { 
	   System.out.println("main function started");
	  
	   }
	 	
	 static
	 	{
	 	  System.out.println("static function started");

	 	  System.out.println(Acess_member_variable_from_block.i);  //can be accessed directly by       class_name.static_variable
	 	  
	 	 Acess_member_variable_from_block a1=new Acess_member_variable_from_block(); 
	 	 
	 	 System.out.println(a1.j);  //object was created to access it in line 22 and then we can access non static variable. 
	 	System.out.println(i);
	   }

	
	}
