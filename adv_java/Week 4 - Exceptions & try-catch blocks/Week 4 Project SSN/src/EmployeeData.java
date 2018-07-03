/* Handout No. 1 - Exercise No. 2
   File Name:          EmployeeData.java
   Programmer:         Broderick Higby
   Date Last Modified: September 19, 2015

   Problem Statement: (what you want the code to do)
   Take an array of employees and collect the data for each. Then print out the
   employees
   
   
   Overall Plan (step-by-step, how you want the code to make it happen):
   1.create employee class that derives from person.java
   2.create all variables and setters and getters 
   3.create employee tester to run all the code
   4. in employeetester instantiate 100 length array of Employee
   5.Go through each iteration of the array and collect the data
   6.Use try catch block for the ssn to see if it's incorrect
   7.Collect the rest of the data
   8.output the array list using toString
   9.Make sure to include the salary avg.

   Classes needed and Purpose (Input, Processing, Output)
   main class - EmployeeData
   other class - Employee, super Person
   Exception classes - SSNLengthException, SSNCharacterException
*/

import java.util.*;
public class EmployeeData
{
	public static void main(String[] args)
	{
		Employee[] employees = new Employee[100];
		Scanner keyboard = new Scanner(System.in);
		boolean done = false;
		
		System.out.println("Please each employees data below.");
		
		//to instantiate each array object
		for(int i = 0; i<employees.length; i++)
		{
			employees[i] = new Employee();
		}
		
		//To make sure the user is finished. Didn't really use.
		while(!done)
		{
				//for going through each employee object in the array
				for(int i = 0; i<employees.length; i++)
				{
					System.out.println();
					int ssn = 000000000;;
					String ssnString;
					double salary = 0.0;
					String name ="";
					boolean right = false;
					int rank;
					String answer= "";
					String junk= "";
					
					System.out.println("Please enter the persons name.");
					name =  keyboard.nextLine();
					
					//to keep the loop going until the get it right.
					while(!right)
					{
						//trying to grab SSN
						try
						{
							System.out.println("Please enter the SSN.");
							ssnString = keyboard.nextLine();
							ssnString.trim();
							//going through each of the positions in the string
							for(int n = 0; n<ssnString.length(); n++)
							{
								//chekcing each posistion to the numbers
								if(!ssnString.substring(n,n+1).equals("0")&&
								!ssnString.substring(n,n+1).equals("1")&&
								!ssnString.substring(n,n+1).equals("2")&&
								!ssnString.substring(n,n+1).equals("3")&&
								!ssnString.substring(n,n+1).equals("4")&&
								!ssnString.substring(n,n+1).equals("5")&&
								!ssnString.substring(n,n+1).equals("6")&&
								!ssnString.substring(n,n+1).equals("7")&&
								!ssnString.substring(n,n+1).equals("8")&&
								!ssnString.substring(n,n+1).equals("9"))
								{
									//throws because a character was used
									throw new SSNCharacterException("Incorrect character entered, what's wrong with you?");
								}
								
							}
							
							//checking length
							if(ssnString.length() != 9)
							{
								//throws for having an invalid length
								throw new SSNLengthException("An SSN is 9 numbers duh...Try again!");
							}
							
							ssn = Integer.parseInt(ssnString);
							right = true;
						}
						//character catch
						catch(SSNCharacterException e)
						{
							System.out.println(e.getMessage());
						}
						//length catch
						catch(SSNLengthException e)
						{
							System.out.println(e.getMessage());
						}
					}
					
					//asking for the rest of the values
					System.out.println("Please enter the salary.");
					salary = keyboard.nextDouble();
					System.out.println("Please enter Employee's job satisfaction. :-( 1-10 :-)");
					rank = keyboard.nextInt();
					
					//temp object to hold values.
					Employee temp = new Employee(name, ssn, salary, rank);
					
					//moving it into the array
					employees[i] = temp;
					
					//to see if the user would like to keep going
					System.out.println("Add another? Y/N");
					junk = keyboard.nextLine();
					answer = keyboard.nextLine();
					if(answer.equalsIgnoreCase("N"))
					{
						done = true;
						break;
					}
					
				}
				
				System.out.println();
				System.out.println();
				System.out.println("The list of employees:");
				System.out.println();
				//printing out each objectin the array
				for(int j = 0; j<employees.length; j++)
				{
					//if the object doesn't have NoName(default) for the employee it prints out
					if(!employees[j].getName().equals("NoName"))
					{
						System.out.println(employees[j]);
						System.out.println(employees[j].getSalaryStandard(employees[j].getSalary()));
						System.out.println();
					}
					else
					{
						break;
					}
				}
		}
	
		
		
		
	}
}