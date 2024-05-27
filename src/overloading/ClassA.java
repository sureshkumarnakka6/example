package overloading;

public class ClassA
{
int meth1()
{
	System.out.println("meth 1 executed");
	return this.meth1(10);
}
private int meth1(int a)
{
	System.out.println("meth 2 executed :"+a);
	return 50;
}
final void meth1(String s)
{
	System.out.println("meth 3 executed :"+s);
}
static void meth1(char c)
{
	System.out.println("meth 4 executed :"+c);
}
protected void meth1(int a, int b)
{
	System.out.println("meth 5 executed :"+(a+b));
}
final String meth1(long b)
{
	System.out.println(10);
	return "suresh";
}
ClassA()
{
	System.out.println("constructor executed");
}
public static void main(String[]args)
{
	
	ClassA ob1=new ClassA();
	ob1.meth1();
	ob1.meth1(20);
	ob1.meth1("suresh");
	meth1('A');
	ob1.meth1(50,100);
	String x=ob1.meth1((long)25);
	System.out.println(x);
}
}
