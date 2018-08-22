//WAP to assign roll no to each student who gets register to the School_1 with there name and mobileno (Hint: string name, long mobileno, static int roll no) 


//this is also called constructor overloading becoz there are many connstructor with same name but with diff arguments 

package pack1;
public class School_1 
{
static int x=0;//this is static the value of this will be stored in x for each object eg a1.rollno=x; 
int rollno;
String name;
long mobileno;

School_1(String name)
{
	this.name=name;
	this.rollno=x+1;
	x=x+1;
}

School_1(String name, long mobileno)
{
	this.name=name;
	this.mobileno=mobileno;
	this.rollno=x+1;
	x=x+1;
}



public static void main(String[] args)
  { 
	School_1 st1 =new School_1("rahul",9876569871l);
    School_1 st2 =new School_1("tony",7656789834l);
    School_1 st3 =new School_1("tony");
    
    st1.display(st1.name,st1.mobileno,st1.rollno);
    st2.display(st2.name,st2.mobileno,st2.rollno);
    st3.display(st3.name,st3.mobileno,st3.rollno);
  }


void display(String x,long y,int z)
{
  System.out.println("name is: "+x);
  System.out.println("mobileno is : "+y);
  System.out.println("roll no is : "+z);
}
}


	

