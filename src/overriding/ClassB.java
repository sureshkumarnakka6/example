package overriding;
import java.util.Scanner;
public class ClassB extends ClassA 
{
Scanner sc=new Scanner(System.in);
void meth1()
	{
    ClassA ob1=new ClassA();//has a relation ship
    
    ob1.getCar();
    ob1.getVehicle();
    ob1.getBike();
    
    System.out.println();
    System.out.println(ob1.getVehicle());
    System.out.println(ob1.getBike());
    
    ob1.setCar(sc.nextInt());
    ob1.setVehicle(sc.next());
    ob1.setBike(sc.next());
    
    System.out.println(ob1.getCar());
    System.out.println(ob1.getVehicle());
    System.out.println(ob1.getBike());
    
   /* ob1.setCar(20);
    ob1.setVehicle("arun");
    ob1.setBike("tarun");*/
	
	}
	
	public static void main(String[]args)
	{
		ClassB ob2=new ClassB();//is a relation ship
		ob2.meth1();
		System.out.println("hello");
		
	}
}
