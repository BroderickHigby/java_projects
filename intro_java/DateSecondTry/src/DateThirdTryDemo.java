/*Program: DateThirdTry	
 *Programmer: Broderick Higby
 *Date: 3-23-2015
 *Description: Returns what the day of the month is after date is entered  .*/

public class DateThirdTryDemo //Beginning of class
{
	public static void main(String[] args)
	{
		DateThirdTry date = new DateThirdTry();
		int year = 1882; //year data type declared as 1882 
		date.setDate(6, 17, year);
		//Variable year not entered because only the year value is entered in the setDate method
		date.writeOutput(); //writes the output
	}//End of method 
} //End of class
