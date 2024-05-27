package practice;
import java.util.Scanner;
public class ClassA 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("welcome to naresh it"+"\n");
		System.out.println("our cources"+"\n");
		int i=1;
		
		do
		{
			System.out.println("FULLSTACK COURCES");
			System.out.println("1)java fullstack");
			System.out.println("2)dot net fullstack");
			System.out.println("3)python fullstack");
			System.out.println("4)ui fullstack");
			System.out.println("5)data science & AI fullstack");
			System.out.println("6)web with react fullstack"+"\n");
			
			System.out.println("DIFFERENT SUBJECTS");
			System.out.println("1)core java");
			System.out.println("2)adv.java");
			System.out.println("3)c language");
			System.out.println("4)selenium");
			System.out.println("5)python");
			System.out.println("6)aws");
			System.out.println("7)power BI");
			System.out.println("8)salesforce");
			System.out.println("9)react JS"+"\n");
			System.out.println("choose one cources/subjects");
			String s=sc.next();
			
			if (s=="cources")
			{
				System.out.println("please give me your valid course number");
				int x=sc.nextInt();
				switch (x)
				{
				case 1:
					System.out.println("java fullstack");
					System.out.println("team of expert : Mr.Venkatesh Maipathii");
					System.out.println("starting date : 20-sep-2023 at 4:00 PM");
					break;
				case 2:
					System.out.println("dot net fullstack");
					System.out.println("team of expert : Bangar Raju");
					System.out.println("starting date : 19-sep-2023 at 7:15 AM");
					break;
				}
				
			}
			else if(s=="subjects")
			{
				System.out.println("please give me your valid subject number");
				int q=sc.nextInt();
				switch (q)
				{
				case 1:
				    System.out.println("core java");
				    System.out.println("team of expert : Mr.Venkatesh Maipathi");
				    System.out.println("starting date : 20-sep-2023 at 4:00 PM");
				    break;
				case 2:
					System.out.println("adv.java");
					System.out.println("team of expert : Mr.Manasani");
					System.out.println("starting date : 19-sep-2023 at 5:30 PM");
					break;
				}
			}
			else
			{
				System.out.println("invalid input");
				System.out.println("please type correct cources name");
			}
		}
		while(i<=0);
		
	}
public static void main(String[]args)
{
	ClassA ob1=new ClassA();
	ob1.meth1();
}
}
