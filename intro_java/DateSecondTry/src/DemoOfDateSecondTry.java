/*Program: DateSecondTry	
 *Programmer: Broderick Higby
 *Date: 3-8-2015
 *Description: Returns what the day of the month is after date is entered  .*/

public class DemoOfDateSecondTry //Beginning of class
{
	public static void main(String[] args) //Beginning of main method
	{
		DateSecondTry date = new DateSecondTry(); //
		date.readInput();  //reads input from DateSecondTry
		
		int dayNumber = date.getDay(); //Calls number value from previous program 
		System.out.println("That is the " + dayNumber
									+ "th day of the month.");
		//Returns inputed value into text form
	}
}
