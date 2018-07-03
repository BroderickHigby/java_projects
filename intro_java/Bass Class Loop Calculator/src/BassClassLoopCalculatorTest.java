import java.util.Scanner;
 //Allows us to use the Scanner class.

public class BassClassLoopCalculatorTest 
{
		public double firstnumber, secondnumber, Total;
		public double addition, subtraction, multiplication, division;
		
	public static void main(String[] args)//Beginning of Method
	{

		
		Scanner keyboard = new Scanner(System.in);//Instantiates the Scanner Object
	    double firstNumber, secondNumber;//Here, these variables are defined to a double value.
		char menuCode = ' ';//menuCode defined as a char value.
		
		do
		{
			//This block of code will display the Calculator Program menu and options.
			System.out.println("\tCalculator Program");
			System.out.println("\n------------------------------------");
			System.out.println("\n\tA:Add" + "\n\tB:Subtract" + "\n\tC:Multiply" + "\n\tD:Divide" + "\n\tX:Exit");
			System.out.println("\n------------------------------------");
			System.out.println("");//Prompts user to choose A,B,C,D, or E
			
	
			menuCode = keyboard.next().charAt(0);//Scans in entered value
			menuCode = Character.toUpperCase(menuCode);//Converts entered char into upper case
	
			
			BassClassLoopCalculator yourProblem = new BassClassLoopCalculator(); //Constructs instance of yourProblem 

				//Beginning of Switch Statement
				switch (menuCode)
				{
					//If A or a was chosen, this case will be executed
					case 'A':
						
						System.out.println("Please enter the first number: ");//Prompts user to enter first number
						firstNumber = keyboard.nextDouble();//Scans in entered value
					
						System.out.println("Please enter the second number: ");//Prompts user to enter a second number
						secondNumber = keyboard.nextDouble();//Scans in entered value
						
						yourProblem.addition(firstNumber, secondNumber); 
						//Calls the addition method to solve the equation, then returns the value 

					    break;
			
					//If B or b was chosen, this case will be executed
					case 'B': 
		
						System.out.println("Please enter the first number: ");//Prompts user to enter first number
						firstNumber = keyboard.nextDouble();//Scans in entered value
					
						System.out.println("Please enter the second number: ");//Prompts user to enter a second number
						secondNumber = keyboard.nextDouble();//Scans in entered value
						
						yourProblem.subtraction(firstNumber, secondNumber);
						//Calls the subtraction method to solve the equation, then returns the value 

						break;
		
					//if C or c was chosen, this case will be executed
					case 'C': 
		
						System.out.println("Please enter the first number: ");//Prompts user to enter first number
						firstNumber = keyboard.nextDouble();//Scans in entered value
					
						System.out.println("Please enter the second number: ");//Prompts user to enter a second number
						secondNumber = keyboard.nextDouble();//Scans in entered value
						
						yourProblem.multiplication(firstNumber, secondNumber);
						//Calls the multiplication method to solve the equation, then returns the value 
					
						break;
			
					//If D or d was chosen, this case will be executed
					case 'D':
		
						System.out.println("Please enter the first number: ");//Prompts user to enter first number
						firstNumber = keyboard.nextDouble();//Scans in entered value
					
						System.out.println("Please enter the second number: ");//Prompts user to enter a second number
						secondNumber = keyboard.nextDouble();//Scans in entered value
						
						yourProblem.division(firstNumber, secondNumber);
						//Calls the addition method to solve the equation, then returns the value 
						
						break;
		
					//If X is chosen, it will exit the program and display this message.
					case 'X':
					
						System.out.println("Thank you for using the Calculator Program.");
						System.exit(0);
						
						break;
					
					//If anything is entered other than the five valid selections, this error message will be displayed.
					default:
		
						System.out.println("Oops, you did not enter a valid selection."
								+ "Please enter one of the four valid selections to continue.");

				} //End of switch statement
				
		
			}while(menuCode != 'X');//If the entered menuCode char will repeat itself as long as X is not entered.
			 
	}//End of Method

} //End of class