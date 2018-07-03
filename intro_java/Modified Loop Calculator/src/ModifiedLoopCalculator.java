/* Program: ModifiedLoopCalculator
 * Programmer: Broderick Higby
 * Date: 3/25/2015
 * Description: This program will demonstrate the basic functions of a calculator
 * through the utilization of a switch statement and do while loop.*/
 
import java.util.Scanner;//Allows us to use the Scanner class.

public class ModifiedLoopCalculator//Beginning of Class
{
	double firstNumber, secondNumber, Total;
	
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
		
			//ModifiedLoopCalculator test = new ModifiedLoopCalculator();
			
				//Beginning of Switch Statement
				switch (menuCode)
				{
					//If A or a was chosen, this case will be executed
					case 'A':
						
						System.out.println("Please enter the first number: ");//Prompts user to enter first number
						firstNumber = keyboard.nextDouble();//Scans in entered value
					
						System.out.println("Please enter the second number: ");//Prompts user to enter a second number
						secondNumber = keyboard.nextDouble();//Scans in entered value
						
					    addition(firstNumber, secondNumber); //establishes the addition object and sends it to the addition method 
						//display();
						break;
			
					//If B or b was chosen, this case will be executed
					case 'B': 
		
						System.out.println("Please enter the first number: ");//Prompts user to enter first number
						firstNumber = keyboard.nextDouble();//Scans in entered value
					
						System.out.println("Please enter the second number: ");//Prompts user to enter a second number
						secondNumber = keyboard.nextDouble();//Scans in entered value
						
						subraction(firstNumber, secondNumber);  //establishes the subtraction object and sends it to the subtraction method 
						//display();
						break;
		
					//if C or c was chosen, this case will be executed
					case 'C': 
		
						System.out.println("Please enter the first number: ");//Prompts user to enter first number
						firstNumber = keyboard.nextDouble();//Scans in entered value
					
						System.out.println("Please enter the second number: ");//Prompts user to enter a second number
						secondNumber = keyboard.nextDouble();//Scans in entered value
						
						multiplacation(firstNumber, secondNumber);  //establishes the multiplication object and sends it to the multiplication method 
						//display();
						break;
			
					//If D or d was chosen, this case will be executed
					case 'D':
		
						System.out.println("Please enter the first number: ");//Prompts user to enter first number
						firstNumber = keyboard.nextDouble();//Scans in entered value
					
						System.out.println("Please enter the second number: ");//Prompts user to enter a second number
						secondNumber = keyboard.nextDouble();//Scans in entered value
						
						division(firstNumber, secondNumber);  //establishes the division object and sends it to the division method 
						//display();
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
				
					}
			
			} while(menuCode != 'X');//If the entered menuCode char will repeat itself as long as X is not entered.
		
	
	}//End of Method
	
	public static void addition(double firstNumber, double secondNumber)	//The addition method
	{
		double Total;	//declares Total as a string
		Total = firstNumber + secondNumber; //calculates firstNumber & secondNumber
		display(Total);	//Sends Total to display 

	}

	public static void subraction(double firstNumber, double secondNumber)	//The subtraction method
	{
		double Total;	//declares Total as a string
		Total = firstNumber - secondNumber; //calculates firstNumber & secondNumber
		display(Total);		//Sends Total to display 
	}
	
	public static void multiplacation(double firstNumber, double secondNumber)//The multiplication method
	{
		double Total;	//declares Total as a string
		Total = firstNumber*secondNumber; //calculates firstNumber & secondNumber
		display(Total);		//Sends Total to display 
	}
	
	public static void division(double firstNumber, double secondNumber)//The division method
	{
		double Total;	//declares Total as a string
		Total = firstNumber/secondNumber; //calculates firstNumber & secondNumber
		display(Total);		//Sends Total to display 
	}
	
	public static void display(double Total)	//display method uses Total string
	{
		System.out.println("The total is " + Total);	//The total is displayed and Total variable is called
	}
	
}//End of Class
