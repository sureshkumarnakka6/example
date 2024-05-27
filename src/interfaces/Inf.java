package interfaces;

public interface Inf {
abstract void love();
abstract void life();
abstract void lang();

default int meth1()
{
	System.out.println("lll");
	return 10;
}
static int meth2() 
{
	System.out.println("jjj");
	return 20;
}
private int meth4() {
	System.out.println("kkk");
	return 30;
}
public static void main(String[]args)
{
	System.out.println("ooo");	
}
}
