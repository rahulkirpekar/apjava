package absdemo.krushyabs;

public class Axisbank implements RbiBank
{
	@Override
	public int getHomeLoan() 
	{
		return 10;
	}

	@Override
	public int getAnnualSavingDipositeIntrst() 
	{
		return 7;
	}
}
