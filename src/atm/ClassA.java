package atm;
import java.util.Scanner;
public class ClassA 
{
public void meth1(int num)
{
	
	for(int i=0;i<=num;i++)
	{
		System.out.println("sorry");	
	}
}
public void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	
	new ClassA().meth1(50);
	sc.close();
}
}
