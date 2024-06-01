package debugging;

public class DebuggingExample {

	int variable=123;
	String data="debug";
	
	public static String call(String value) {
		System.out.println("method executed");
		double amount=1000.00;
		String msg="hello "+value;		
		return msg;
	}
	
	public static void main(String[] args) {
		DebuggingExample object=new DebuggingExample();
		String response=call("every one");
		System.out.println(response);
		System.out.println(object.variable);
		System.out.println(object.data);
	}
}
