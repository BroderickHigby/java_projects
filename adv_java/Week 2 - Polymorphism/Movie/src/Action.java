//This is the action genre 
public class Action extends Movie
{        
	//Calculates late fees 
	
	public double calcLateFees(int daysLate)
	{
		double lateFee= daysLate * 3; //This is the days late * genre's specific price 

		return lateFee;
	}
}
