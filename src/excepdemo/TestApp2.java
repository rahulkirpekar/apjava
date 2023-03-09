package excepdemo;

public class TestApp2 
{
	public static void isValidForVote(int age) throws ArithmeticException
	{
		if (age < 18) 
		{
			throw new ArithmeticException("Invalid Age \n\t Please enter above 18");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{

		try 
		{
			isValidForVote(10);
		} catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		System.out.println("SASFG ");
	}

}
