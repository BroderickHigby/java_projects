import java.util.*;
public class Employee extends Person
{
	int SSN;
	double salary;
	int rank;
	Scanner keyboard = new Scanner(System.in);
	
	//constructors
	public Employee()
	{
		super();
		SSN = 000000000;
		salary = 0.0;
	}
	public Employee(String initialName, int mySSn, double mySalary, int myRank)
	{
		
		SSN = mySSn;
		salary = mySalary;
		rank = myRank;
	}
	public Employee(String initialName, Date birthDate, Date deathDate, int mySSN, int mySalary)
	{
		
		SSN = mySSN;
		salary = mySalary;
	}
	//setters and getters for each variable
	public void setSSN()
	{
		System.out.println("Please enter the SSN.");
		SSN = keyboard.nextInt();
	}
	public void setSSN(int mySSN)
	{
		SSN = mySSN;
	}
	public int getSSN()
	{
		return SSN;
	}
	public void setSalary()
	{
		System.out.println("Please enter the Salary.");
		salary = keyboard.nextDouble();
	}
	public void setSalary(double mySalary)
	{
		salary = mySalary;
	}
	public double getSalary()
	{
		return salary;
	}
	//to check to see if they are above average or not
	public String getSalaryStandard(double mySalary)
	{
		String response;
		if(mySalary < 50000)
		{
			response = "Salary is below average";
		}
		else
		{
			response = "Salary is above average";
		}
		return response;
	}
	
	//to string to print out the array
	public String toString()
	{
		return "Employee Name:		" + this.getName() +
				"\nEmployee SSN:		" + SSN +
				"\nEmployee salary:	" + salary +
				"\nEmployee rank:		" + rank;
	}
	
}



/*Public class Employee
{


Public void SetSSN (String SSN) throws SSNCharacterException, SSNLengthException
{
	if(SSN.length) != 9)
	{
	throw new SSNLengthException();
	}
	try
	{
	int social = Integer.parseInt(SSN);
	}
	catch(NumberFormatException e)
	{
		e.getmessage("No numbers allowed");

	}
		throw new SSNCharacterException("Try again");
}
*/

	