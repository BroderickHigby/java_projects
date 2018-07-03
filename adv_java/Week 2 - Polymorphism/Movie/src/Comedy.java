
public class Comedy extends Movie
{
	//Calculates late fees 
	
	public double calcLateFees(int daysLate)
	{
		double lateFee= daysLate * 2.5; //This is the days late * genre's specific price 

		return lateFee;
	}
}
