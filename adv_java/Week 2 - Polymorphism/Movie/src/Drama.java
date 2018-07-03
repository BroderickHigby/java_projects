
public class Drama extends Movie
{
	//Calculates late fees 

	public double calcLateFees(int daysLate)
	{
		double lateFee= daysLate * 2; //This is the days late * genre's specific price 

		return lateFee;
	}
}