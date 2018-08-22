package pack1;

public class Object_test {


static int x=1;
       int y=2;

public static void main( String[] args)
{
Object_test a1=new Object_test();
System.out.println(a1.y);
Object_test a2= new Object_test();
System.out.println(a2.y);
a2.y=9;
System.out.println(a2.y);
System.out.println(a1.x);
x=7;
System.out.println(a1.x);

}
}
