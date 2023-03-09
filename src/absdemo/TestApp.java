package absdemo;

public class TestApp 
{
	public static void main(String[] args) 
	{
		AxisBank axis = new AxisBank();
		System.out.println(axis.getHomeLoanInterest());

		SbiBank sbi = new  SbiBank();
		
		System.out.println(sbi.getHomeLoanInterest());
				
	}
}
