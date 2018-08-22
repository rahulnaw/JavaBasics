//2 main fxns can  exist.
//Here two main fxns are there but the arguments being accpeted by each of them is diff 
//if arguments being acceptes are same then compiler will throw error

package pack1;
public class Two_main_functions
{


public static void main(String args[])
{ 
	int a=55;
	
main(a);

}

static int main(int x)
	{

System.out.println("main is "+x);

return 3;
}

}