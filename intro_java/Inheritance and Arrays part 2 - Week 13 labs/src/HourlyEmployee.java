/*-----------------------------------------------------
 *Program: HourlyEmployee.java
 *Programmer: Broderick Higby
 *Date: 4/16/2015
 *Description:For this display we are creating another
 *base class for employee information and we will also
 *be using a derived class which will add instance
 *variables and methods to an existing class.
 *----------------------------------------------------*/
 
 /** 
  *Class Invariant: All objects have a name string, hire date, nonnegative
  *wage rate, and nonnegative number of hours worked. A name string of 
  *"No name" indicates no real name specified yet. A hire date of January 1, 1000
  *indicates no real hire date specified yet.
  */
  
  //public class name 
  public class HourlyEmployee extends Employee
  {
  	//declaring private variables
  	private double wageRate;
  	//for the month
  	private double hours;
  	
  	//public method statement
  	public HourlyEmployee()
  	{
  		//super constructor
  		super();
  		
  		//setting wageRate equal to zero
  		wageRate = 0;
  		
  		//setting hours equal to zero
  		hours = 0;
  		
  	} //end public method statement
  	
  	/**
  	 *Precondition: Neither theName nor theDate is null;
  	 *theWageRate and theHours are nonnegative.
  	 */
  	 
  	 //public method statement
  	 public HourlyEmployee(String theName, Date theDate, double theWageRate, double theHours)
  	 {
  	 	//super constructor for theName, theDate
  	 	super(theName, theDate);
  	 	
  	 	//if statement
  	 	if ((theWageRate >= 0) && (theHours >= 0))
  	 	{
  	 		//setting wageRate equal to theWageRate
  	 		wageRate = theWageRate;
  	 		
  	 		//setting hours equal to theHours
  	 		hours = theHours;
  	 		
  	 	} //end if statement
  	 	
  	 	//else statement
  	 	else
  	 	{
  	 		//Display error message for incorrect hourly employee
  	 		System.out.println("Fatal Error: creating an illegal hourly employee.");
  	 		
  	 		//exit statement
  	 		System.exit(0);
  	 		
  	 	} //end else statement
  	 	
  	 } //end of public method statement
  	 
  	 //public method statement
  	 public HourlyEmployee(HourlyEmployee originalObject)
  	 {
  	 	//super constructor for originalObject
  	 	super (originalObject);
  	 	
  	 	//setting wageRate equal to originalObject.wageRate
  	 	wageRate = originalObject.wageRate;
  	 	
  	 	//setting hours equal to originalObject.hours
  	 	hours = originalObject.hours;
  	 	
  	 } //end of public method statement
  	 
  	 //public method statement
  	 public double getRate()
  	 {
  	 	//return statement
  	 	return wageRate;
  	 	
  	 } //end of public method statement
  	 
  	 //public method statement
  	 public double getHours()
  	 {
  	 	//return statement
  	 	return hours;
  	 	
  	 } //end of public method statement
  	 
  	 //returns the pay for the month.
  	 //public method statement
  	 public double getPay()
  	 {
  	 	//return statement
  	 	return wageRate*hours;
  	 	
  	 } //end of public method statement
  	 
  	 //precondition hoursWorked is nonnegative
  	 public void setHours(double hoursWorked)
  	 {
  	 	//if statement
  	 	if (hoursWorked >=0)
  	 		//setting hours equals to hoursWorked
  	 		hours = hoursWorked;
  	 	
  	 	//else statement
  	 	else
  	 	{
  	 		//Displays error message
  	 		System.out.println("Fatal Error: Negative hours worked.");
  	 		
  	 		//exit statement
  	 		System.exit(0);
  	 		
  	 	} //end of else statement
  	 	
  	 } //end of public method statement
  	 
  	 //precondition: newWageRate is nonnegative.
  	 //public method statement
  	 public void setRate(double newWageRate)
  	 {
  	 	//if statement
  	 	if(newWageRate >= 0)
  	 		//setting wageRate equal to newWageRate
  	 		wageRate = newWageRate;
  	 	
  	 	//else statement	
  	 	else
  	 	{
  	 		//Displays error message
  	 		System.out.println("Fatal Error: Negative wage rate.");
  	 		
  	 		//exit statement
  	 		System.exit(0);
  	 		
  	 	} //end of else statement
  	 	
  	 } //public method statement
  	 
  	 //public method statement
  	 public String toString()
  	 {
  	 	//return statement displaying several set variables
  	 	return (getName() + " " + getHireDate().toString() + "\n$" + wageRate + 
  	 			" per hour for " + hours + " hours");
  	 			
  	 } //end of public method statement
  	 
  	 //public boolean method statement
  	 public boolean equals(HourlyEmployee other)
  	 {
  	 	//return statement 
  	 	return (getName().equals(other.getName()) && getHireDate().equals(other.getHireDate())
  	 			&& wageRate == other.wageRate && hours == other.hours);
  	 			
  	 } //end of public boolean method statement
  	 
  } //end of public class