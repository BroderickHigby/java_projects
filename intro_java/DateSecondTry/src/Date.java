/*-------------------------------------------------------------------
 *Program:Date.java
 *Programmer: Broderick Higby
 *Date: 3/24/15
 *Description: For this display we rewriting the date class and are 
 *working with constructors. we included all previous method definitions.
 *------------------------------------------------------------------*/
 
 //importing the scanner
 import java.util.Scanner;
 
 //public class name
 public class Date
 {
 	//declaring private variables
 	private String month;
 	private int day;
 	private int year; //a four digit number.
 	
 	//public method
 	public Date()
 	{
 		//no argument constructors
 		month = "January";
 		day = 1;
 		year = 1000;
 		
 	} //end public method
 	
 	//public method
 	public Date(int monthInt, int day, int year)
 	{
 		//invoking method inside a constructor
 		setDate(monthInt, day, year);
 	} //end public method
 	
 	//public method
 	public Date(String monthString, int day, int year)
 	{
 		//invoking method inside a constructor
 		setDate (monthString, day, year);
 		
 	} //end public method
 	
 	//public method
 	public Date(int year)
 	{
 		//constructor definition
 		setDate (1, 1, year);
 	}  //end public method
 	
 	//public method
 	public Date(Date aDate)
 	{
 		//if statement
 		if (aDate == null) //Not a real date.
 		{
 			//display message
 			System.out.println("Fatal Error.");
 			
 			//exit statement
 			System.exit(0);
 			
 		} //end if statement
 		
 		//calling overloaded variables
 		month = aDate.month;
 		day = aDate.day;
 		year = aDate.year;
 		
 	} //end public method
 	
 	//public method 
 	public void setDate(int monthInt, int day, int year)
 	{
 		//if statement
 		if (dateOK(monthInt, day, year))
 		{
 			//calling constructor mutators
 			this.month = monthString(monthInt);
 			this.day = day;
 			this.year = year;
 		} //end if statement
 		
 		//else statement
 		else
 		{
 			//display message
 			System.out.println("Fatal Error.");
 			
 			//exit statement
 			System.exit(0);
 			
 		} //end else statement
 		
 	} //end public method
 	
 	//public method
 	public void setDate(String monthString, int day, int year)
 	{
 		//if statement
 		if (dateOK(monthString, day, year))
 		{
 			//calling overloaded methods
 			this.month = monthString;
 			this.day = day;
 			this.year = year;
 		} //end if statement
 		
 		//else statement
 		else
 		{
 			//display message
 			System.out.println("Fatal Error.");
 			
 			//exit statement
 			System.exit(0);
 			
 		} //end else statement
 		
 	} //end public method
 	
 	//public method
 	public void setDate(int year)
 	{
 		//no argument constructor
 		setDate(1, 1, year);
 		
 	} //end public method
 	
 	//public method statement
 	public void setYear(int year)
 	{
 		//if statement
 		if ( (year < 1000) || (year > 9999) )
 		{
 			//display message
 			System.out.println("Fatal Error.");
 			
 			//exit statement
 			System.exit(0);
 			
 		} //end if statement
 		
 		//else statement
 		else
 			//call overloaded method
 			this.year = year;
 			
 	} //end else statement
 	
 	//public method statement
 	public void setMonth(int monthNumber)
 	{
 		//if statement
 		if ((monthNumber <=0) || (monthNumber >12) )
 		{
 			//display message
 			System.out.println("Fatal Error.");
 			
 			//exit statement
 			System.exit(0);
 			
 		} //end if statement
 		
 		//else statement
 		else
 		
 			//call overloaded method
 			month = monthString(monthNumber);
 			
 	} //end public statement
 	
 	//public method statement
 	public void setDay (int day)
 	{
 		//if statement
 		if ((day <= 0) || (day > 31))
 		{
 			//display message
 			System.out.println("Fatal Error.");
 			
 			//exit statement
 			System.exit(0);
 			
 		} //end if statement
 		
 		//else statement
 		else
 			
 			//call overloaded method
 			this.day = day;
 	} //end public statement
 	
 	//public heading
 	public int getMonth()
 	{
 		//if statement
 		if (month.equalsIgnoreCase("January"))
 		
 			//return statement
 			return 1;
 			
 		//else if statement	
 		else if (month.equalsIgnoreCase("February"))
 			
 			//return statement
 			return 2;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("March"))
 			
 			//return statement
 			return 3;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("April"))
 			
 			//return statement
 			return 4;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("May"))
 			
 			//return statement
 			return 5;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("June"))
 			
 			//return statement
 			return 6;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("July"))
 			
 			//return statement
 			return 7;
 		
 		//else if statement		
 		else if (month.equalsIgnoreCase("August"))
 			
 			//return statement
 			return 8;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("September"))
 			
 			//return statement
 			return 9;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("October"))
 			
 			//return statement
 			return 10;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("November"))
 			
 			//return statement
 			return 11;
 			
 		//else if statement		
 		else if (month.equalsIgnoreCase("December"))
 			
 			//return statement
 			return 12;
 			
 		//else statement		
 		else
 		{
 			//Will display Fatal Error message
 			System.out.println("Fatal Error");
 			
 			//Will exit the program
 			System.exit(0);
 			
 			//Needed to keep the compiler happy
 			return 0; 
 			
 		} //end of else statement
 		
 	} //end public method 
 	
 	//public method
 	public int getDay()
 	{
 		//return statement
 		return day;
 		
 	} //end public method
 	
 	//public method
 	public int getYear()
 	{
 		//return statement
 		return year;
 		
 	} //end public method
 	
 	//public method
 	public String toString()
 	{
 		//return statement
 		return (month + " " + day + ", " + year);
 		
 	} //end public method
 	
 	//public boolean statement
 	public boolean equals(Date otherDate)
 	{
 		//return statement
 		return ( (month.equals(otherDate.month)) 
 				&&	(day == otherDate.day) && (year == 
 				otherDate.year) );
 		
 	} //end public boolean statement
 	
 	//public boolean statement
 	public Boolean precedes(Date otherDate)
 	{
 		//return statement
 		return ( (year < otherDate.year) ||
 				(year == otherDate.year && getMonth() <
 				 otherDate.getMonth()) ||
 				 (year == otherDate.year && month.equals(otherDate.month)
 				 							&& day < otherDate.day) );
 	} //end public boolean statement
 	
 	//public method statement
 	public void readInput()
 	{
 		//boolean expression
 		boolean tryAgain = true;
 		
 		//instantiating scanner
 		Scanner keyboard = new Scanner(System.in);
 		
 		//while statement
 		while (tryAgain)
 		{
 			//display message/prompt user
 			System.out.println("Enter month, day, and year.");
 			System.out.println("Do not user a comma.");
 			
 			//scan keyboard input
 			String monthInput = keyboard.next();
 			int dayInput = keyboard.nextInt();
 			int yearInput = keyboard.nextInt();
 			
 			//if statement
 			if (dateOK(monthInput, dayInput, yearInput) )
 			{
 				//mutator constructor
 				setDate(monthInput, dayInput, yearInput);
 				
 				//boolean return
 				tryAgain = false;
 			} //end if statement
 			
 			//else statement
 			else
 			
 				//display message
 				System.out.println("Illegal date. Reenter input.");
 		} //end while statement
 		
 	} //end public method
 	
 	//public boolean statement
 	private boolean dateOK(int monthInt, int dayInt, int yearInt)
 	{
 		//return statement
 		return ( (monthInt >= 1) && (monthInt <= 12) &&
 				(dayInt >= 1) && (dayInt <=31) &&
 				 (yearInt >= 1000) && (yearInt <=9999) );
 				 
 	} //end private boolean statement
 	
 	//private boolean statement
 	private boolean dateOK(String monthString, int dayInt, int yearInt)
 	{
 		//return statement
 		return ( monthOK(monthString) && (dayInt >= 1) && (dayInt <= 31) 
 				&& (yearInt >= 1000) && (yearInt <= 9999) );
 				
 	} //end private boolean statement
 	
  	//private boolean statement
  	private boolean monthOK(String month)
  	{
  		//return statement
  		return (month.equals("January") || month.equals("February") ||
  				month.equals("March") || month.equals("April") ||
  				month.equals("May") || month.equals("June") ||
  				month.equals("July") || month.equals("August") ||
  				month.equals("September") || month.equals("October") ||
  				month.equals("November") || month.equals("December") );
  				
 	} //end private boolean statement
 	
 		//private string statement
 		private String monthString (int monthNumber)
 		{
 			
 		//switch statement
 		switch (monthNumber)
 		{
 			//case statement
 			case 1:
 				return "January";
 			
 			//case statement	
 			case 2:
 				return "February";
 			
 			//case statement	
 			case 3:
 				return "March";
 			
 			//case statement	
 			case 4:
 				return "April";
 			
 			//case statement	
 			case 5:
 				return "May";
 			
 			//case statement	
 			case 6:
 				return "June";
 			
 			//case statement	
 			case 7:
 				return "July";
 			
 			//case statement	
 			case 8:
 				return "August";
 			
 			//case statement	
 			case 9:
 				return "September";
 			
 			//case statement	
 			case 10:
 				return "October";
 			
 			//case statement	
 			case 11:
 				return "November";
 			
 			//case statement	
 			case 12:
 				return "December";
 			
 			//default message	
 			default:
 				
 				//Will display Fatal Error
 				System.out.println("Fatal Error");
 				
 				//system exit
 				System.exit(0);
 				
 				//to keep the compiler happy
 				return "Error"; 
 				
 			} //end of switch statement
 			
 		} //end of private string statement
 		
 } //end of public class Date