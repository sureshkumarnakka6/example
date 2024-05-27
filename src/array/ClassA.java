package array;
import java.util.Arrays;
public class ClassA 
{
int[] left(int []arr)
{
	for(int i=0;i<=arr.length-1;i++)
	{
		
	return new int[] {arr[1],arr[2],arr[0]};	
	}
	return new int[] {arr[0],arr[1],arr[2]};
}
	

public static void main(String [] args)
{
	ClassA ob1=new ClassA();
	int arr[]= {45,28,258,451,44};
	int[] nums=ob1.left(arr);
	System.out.println(Arrays.toString(nums));
}
}
