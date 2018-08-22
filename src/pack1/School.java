//WAP to assign roll no to each student who gets register to the school with there name and mobileno (Hint: string name, long mobileno, static int roll no)

//this program written as School_1


package pack1;
public class School 
{
static int rollno=0;
String name;
long mobileno;

School(String name, int mobileno)
{
	this.name=name;
	this.mobileno=mobileno;
	}

public static void main(String[] args)
  { 
	School st1 =new School("rahul",98768888);
 	st1.assign(st1.rollno);
    st1.display(st1.name,st1.mobileno,st1.rollno);
    
    School st2 =new School("tony",76567898);
    st2.assign(st2.rollno);
    st2.display(st2.name,st2.mobileno,st2.rollno);
       }

int assign(int rollno)
{
	 this.rollno=this.rollno+1;
	return this.rollno;
}

void display(String x,long y,int z)
{
  System.out.println("name is: "+x);
  System.out.println("mobileno is : "+y);
  System.out.println("roll no is : "+z);
}
}
