package basic;

public class Excep {

	public static void main(String[] args) {
		
		try
		{
			int d=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
	}

}
