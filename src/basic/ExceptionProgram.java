package basic;
public class ExceptionProgram {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		try
		{
			int c= 30/0;
		}
		catch(Exception a)
		{
			System.out.println("arithmetic");
			System.out.println(a.getMessage());
		}
		System.out.println("hello");
		
		try 
		{
		String s= null;	
		System.out.println(s.length());
		}
		catch(Exception f)
		{
			System.out.println("null pointer exception");
			System.out.println(f.getMessage());
		}
		
	}
	

}
