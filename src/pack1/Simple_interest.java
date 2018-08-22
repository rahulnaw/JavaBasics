package pack1;

public class Simple_interest {

	public static void main(String args[])
	 { 
	int p=400	;
	int r=2;
	int t=5;
	int s=0;

	 s=simplein(p,r,t);

	  System.out.println(s);
	  
	  }


	static int simplein(int x,int y,int z)
		{
		int n=0;

		n=(x*y*z)/100;
		return n;

	  }
}
