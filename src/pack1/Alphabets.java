package pack1;

public class Alphabets 

{
	static int  n=9;
	public static void main(String[] args)
	
	{	
	System.out.println("tina");
		t();i();n();a();
		System.out.println();
		
		System.out.println("sam");
		s(); a();  m();
		System.out.println();

		System.out.println("grand");
		g();r();a();n();d();
		System.out.println();
		
		System.out.println("fail");
		f();a();i();l();
		System.out.println();  
		
	}
	
static void s()
{
	int i,j;
	
	for (i=1;i<=n;i++)
		{
		for (j=1;j<=n;j++)	
			{
					if (	i==1 ||i==n || (j==1 && i<=n/2)	||	(j==n && i>=n/2)	||	i==n/2+1	)
	    				{System.out.print("*");
				}
				else 
				System.out.print(" ");

			}
			System.out.println();
			}}

static void a()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if (	(j==1 && i>n/2)	||  (j==n && i>n/2)  || i+j==n/2+2 || j-i==n/2 || i==n/2+1	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
System.out.println();
}

static void m()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if ( (j==1 )	||  j==n  || (i==j && i<=n/2) || (i+j==n+1 && i<=n/2) || (j==n/2+1 && i>=n/2+1)	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void t()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if ( (i==1 )	||  j==n/2+1	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void i()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if ( (i==1 )	||  j==n/2+1 || i==n	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void n()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if ( (j==1 )	||  j==i || j==n	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void g()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if ( j==1||	i==1 ||	i==n && j<=n/2+1 ||	j==n/2+1&&i>=n/2+1	||	i==n/2+1 &&	j>=n/2+1 ||	j==n	&&	i>=n/2+1	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void k()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if ( j==1|| i+j==n-1||i==j&&i>=n/2+1	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void f()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if ( i==1||j==1||i==4&&j<=n/2+1	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void l()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if ( i==n||j==1	)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void r()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if (j==1||i==1||i==n/2+1||i-j==n/2||j==n&&i<=n/2+1)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

static void d()
{
int i,j;

for (i=1;i<=n;i++)
{
for (j=1;j<=n;j++)	
	{
			if (i==n  &&   j>=n/2+1  ||     j==n/2+1 && i >=n/2+1  ||   i==n/2+1 && j >=n/2+1  || j==n)
				{System.out.print("*");
			
		}
		else 
		System.out.print(" ");

	}
	System.out.println();
}   
}

}
