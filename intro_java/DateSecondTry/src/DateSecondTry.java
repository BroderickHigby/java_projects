/*Program: DateSecondTry	
 *Programmer: Broderick Higby
 *Date: 3-8-2015
 *Description: Returns what the day of the month is after date is entered  .*/
import java.util.Scanner; //Imports scanner class

public class DateSecondTry //Begins class
{
	private String month; //Private determines whether another class can use the field 
	private int day;  
	private int year; //A four digit number
	
	public void writeOutput()  
	{
		System.out.println(month+""+ day + "," + year);
	}
	
	public void readInput()
	{
		Scanner keyboard = new Scanner (System.in);  //Accepts keyboard input
		System.out.println("Enter month, day,and year.");
		System.out.println("Do not use a comma.");
		month=keyboard.next();
		day=keyboard.nextInt(); 
		year=keyboard.nextInt();
		//Saves input and sends to writeOutput & individual strings
	}
	public int getDay()
	{
	return day; //Returns the value entered 
	}
	public int getYear()
	{
	return year;
	}
	
	public int getMonth() //Begins loop to output a month
	{
		if (month.equalsIgnoreCase("January"))
			return 1;
		else if (month.equalsIgnoreCase("February"))
			return 2;
		else if (month.equalsIgnoreCase("March"))
			return 3;
		else if (month.equalsIgnoreCase("April"))
			return 4;
		else if (month.equalsIgnoreCase("May"))
			return 5;
		else if (month.equalsIgnoreCase("June"))
			return 6;
		else if (month.equalsIgnoreCase("July"))
			return 7;
		else if (month.equalsIgnoreCase("August"))
			return 8;
		else if (month.equalsIgnoreCase("September"))
			return 9;
		else if (month.equalsIgnoreCase("October"))
			return 10;
		else if (month.equalsIgnoreCase("November"))
			return 11;
		else if (month.equalsIgnoreCase("December"))
			return 12;
		else
		{
			System.out.println("Fatal Error");
			System.exit(0); 
			return 0; //Exits the program, needed to keep the compiler happy
		}
	} 	
}
