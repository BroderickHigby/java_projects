/*-----------------------------------------------------
 *Program: SalariedEmployee.java
 *Programmer: Broderick Higby
 *Date: 4/17/2015
 *Description: For this display derived from the class
 *Employee SalariedEmployee inherits all the instance
 *variables and methods of the class Employee. For this
 *display we are working with inheritance and how it 
 *allows us to reuse code from other classes without having
 *to copy the code into our definitions.
 *-----------------------------------------------------*/
 
 /**Class Invariant: All objects have a name string, hire date,
  *and nonnegative salary. A name string of "No name" indicates
  *no real name specified yet. A hire date of Januray 1, 1000 indicates no
  *real hire date specified yet.
  */
  
  //public class name
  public class SalariedEmployee extends Employee
  {
  	//annual salary
  	//private variable declaration
  	private double salary;
  	
  	//public method statement
  	public SalariedEmployee()
  	{
  		//super constructor
  		super();
  		
  		//setting salary equal to zero
  		salary = 0;
  		
  	} //end of public method statement
  	
  	//precondition: neither theName nor theDate are null;
  	//theSalary is nonnegative.
  	
  	//public method statement for SalariedEmployee
  	public SalariedEmployee(String theName, Date theDate, double theSalary)
  	{
  		//super constructor for theName, theDate
  		super(theName, theDate);
  		
  		//if statement
  		if (theSalary >= 0)
  			//setting salary equal to theSalary
  			salary = theSalary;
  		
  		//else statement
  		else
  		{
  			//Displays error message if a negative salary is entered
  			System.out.println("Fatal Error: Negative salary.");
  			
  			//exit statement
  			System.exit(0);
  			
  		} //end else statement
  		
  	} //end of public method statement
  	
  	//public method statement SalariedEmployee
  	public SalariedEmployee(SalariedEmployee originalObject)
  	{
  		//super constructor for originalObject
  		super(originalObject);
  		
  		//setting salary equal to originalObject.salary
  		salary = originalObject.salary;
  		
  	} //end of public method statement
  	
  	//public method statement for getSalary()
  	public double getSalary()
  	{
  		//return statement salary
  		return salary;
  		
  	} //end of public method statement
  	
  	//returns the pay for the month.
  	//public method statement getPay()
  	public double getPay()
  	{
  		//return statement for salary divided by 12(months)
  		return salary/12;
  		
  	} //end of public method statement
  	
  	//precondition: newSalary is nonnegative
  	//public method statement for setSalary
  	public void setSalary(double newSalary)
  	{
  		//if statement
  		if (newSalary >= 0)
  			//setting salary equal to newSalary
  			salary = newSalary;
  		
  		//else statement
  		else
  		{
  			//displays error message if a negative salary is entered
  			System.out.println("Fatal Error: Negative salary.");
  			
  			//exit statement
  			System.exit(0);
  			
  		} //end of else statement
  		
  	} //end of public method statement
  	
  	//public method statement for toString()
  	public String toString()
  	{
  		//return statement
  		return (getName() + " " + getHireDate().toString() + "\n$" + salary + " per year");
  		
  	} //end of public method statement
  	
  	//public boolean method statement
  	public boolean equals(SalariedEmployee other)
  	{
  		//return statement
  		return (getName().equals(other.getName()) && getHireDate().equals(other.getHireDate())
  				&& salary == other.salary);
  				
  	} //end of public boolean method statement
  	
  } //end of class