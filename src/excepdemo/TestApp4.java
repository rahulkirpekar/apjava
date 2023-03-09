package excepdemo;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		
		String name = null;

		try 
		{
			System.out.println(name.length());
			
		} catch(Exception e)
		{
			System.out.println("catch handled");
		}finally 
		{
			System.out.println("finally");
		}
		System.out.println("After try catch");
	}
}
