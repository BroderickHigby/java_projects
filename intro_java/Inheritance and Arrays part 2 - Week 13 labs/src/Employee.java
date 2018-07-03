/*------------------------------------------------
 *Program: Employee.java
 *Programmer: Broderick Higby
 *Date: 4/16/2015
 *Description: This display is the one of the base
 *classes that will be used for employee data such
 *as pay and employee. We are using inheritance.
 *-----------------------------------------------*/
 
 /**
  *Class invariant: All objects have a name string and hire date.
  *A name string of "No Name" indicates no real name specified yet.
  *A hire date of January 1, 1000 indicates no real hire date specified yet.
  */
  
  //public class name
  public class Employee
  {
  	//declaring private variables
  	private String name;
  	private Date hireDate;
  	
  	//public method statement employee
  	public Employee()
  	{
  		//setting name variable equals to no name
  		name = "No name";
  		
  		//Just a placeholder
  		hireDate = new Date("January", 1, 1000);
  		
  	} //end public method statement
  	
  	//Precondition: Neither theName nore theDate is null.
  	public Employee(String theName, Date theDate)
  	{
  		//if statement
  		if (theName == null || theDate == null)
  		{
  			//Display error message
  			System.out.println("Fatal Error creating employee.");
  			
  			//exit statement
  			System.exit(0);
  			
  		} //end if statement
  		
  		//setting the name equal to theName
  		name = theName;
  		
  		//setting hireDate equal to Date(theDate)
  		hireDate = new Date(theDate);
  		
  	} //end public method statement
  	
  	//public method statement
  	public Employee(Employee originalObject)
  	{
  		//setting name equal to originalObject.name
  		name = originalObject.name;
  		
  		//setting hireDate equal to Date(originalObject.hireDate)
  		hireDate = new Date(originalObject.hireDate);
  		
  	} //end public method statement
  	
  	//public method statement
  	public String getName()
  	{
  		//return statement
  		return name;
  		
  	} //end public method statement
  	
  	//public method statement
  	public Date getHireDate()
  	{
  		//return statement
  		return new Date(hireDate);
  		
  	} //end public method statement
  	
  	//Precondition newName is not null.
  	public void setName(String newName)
  	{
  		//if statement
  		if (newName == null)
  		{
  			//displays error message
  			System.out.println("Fatal Error setting employee name.");
  			
  			//exit statement
  			System.exit(0);
  			
  		} //end of if statement
  		
  		//else statement
  		else
  			//setting name equals to newName
  			name = newName;
  			
  	} //end of public method statement
  	
  	//precondition newDate is not null.
  	public void setHireDate(Date newDate)
  	{
  		//if statement
  		if (newDate == null)
  		{
  			//display error message
  			System.out.println("Fatal Error setting employee hire " + "date.");
  			
  			//exit statement
  			System.exit(0);
  			
  		} //end if statement
  		
  		//else statement
  		else
  			//setting hireDate equal to new Date(newDate)
  			hireDate = new Date(newDate);
  			
  	} //end of public precondition method statement
  	
  	//public method statement
  	public String toString()
  	{
  		//return statement
  		return(name + " " + hireDate.toString());
  		
  	} //end of public method statement
  	
  	//public boolean method statement
  	public boolean equals(Employee otherEmployee)
  	{
  		//return statement
  		return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
  		
  	} //end of public boolean method statement
  	
  } //end of class