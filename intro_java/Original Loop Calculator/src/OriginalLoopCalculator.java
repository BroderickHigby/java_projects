/*----------------------------------
 *Program: OriginalLoopCalculator.java
 *Programmer: Broderick Higby
 *Date: 02/21/2015(Modified 
 *Description: For this program we will be creating a calculator program that 
 *will add, subtract, multiply, and divide. We will create the program to prompt
 *the user and to take the users input to determine which calculation to use and 
 *then two more input numbers to carry out the calculations. We will be using
 *nested if else statements to determine the users choice. If the user does not
 *input a designated letter that is provided there will be a error message displayed.
 *-----------------------------------------*/
 //We'll be using the java.util.Scanner for this project
import java.io.*;
import java.util.Scanner;

	//This is my class header
public class OriginalLoopCalculator 
{
 
	double firstNumber, secondNumber, answer;
	
 	//This is my main method
 	public static void main(String[] args)
 
 	{
 		//Instantiating scanner
 		Scanner keyboard = new Scanner(System.in);
 		
 		//Declaring variables char, double, int
 		char menuCode;
 		double firstNumber, secondNumber, answer;

 		 	
 		//start of do-while loop 		
 		do
 		{
 			
 		 //Will display what it the " " 		
 		System.out.println ("Calculator Program.");
 		
 		//Will display what it the " " 
 		System.out.println("\n------------------------------------------");
 		System.out.println("Enter A for Addition. \n" + "Enter B for Subtraction. \n" + 
 							"Enter C for Multiplication. \n" + "Enter D for Division. \n" + "Or press X to quit the program\n");	
 		System.out.println("------------------------------------------");
 		
 		System.out.println("Please select a designated code from above: ");
 							
 		//scans in first character
 		menuCode = keyboard.next().charAt(0);	
 		
 		//converts all case letters to uppercase entries
 		menuCode = Character.toUpperCase(menuCode);
 		
 		//switch statement for menuCode A				 		
 			switch (menuCode)
 		
 			{
 				//Case A
 				case 'A':
 				//Will display what is in the " "
 				System.out.println("You chose Addition");
 			
 				System.out.println();
 			
 				//Prompting user to "Enter your first number"
 				System.out.print("Enter your first number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				firstNumber = keyboard.nextDouble();
 			
 				System.out.println();
 			
 				//Prompting the user to "Enter your second number"
 				System.out.print("Enter your second number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				secondNumber = keyboard.nextDouble();
 			
 				//Calculating the answer of firstnumber + secondnumber
 				answer = firstNumber + secondNumber;
 				//display();
 			
 				//break statement
 				break;
 				
 				//Case B
  				case 'B':
 				//Will display what is in the " "
 				System.out.println("You chose Subtraction");
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Prompting user to "Enter your first number"
 				System.out.print("Enter your first number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				firstNumber = keyboard.nextDouble();
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Prompting the user to "Enter your second number"
 				System.out.print("Enter your second number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				secondNumber = keyboard.nextDouble();
 			 			 			
 				//Calculating the answer of firstnumber - secondnumber
 				answer = firstNumber - secondNumber;
 				//display();	

 				//break statement
 				break;
 				 	
  				//Case C
  				case 'C':
 				//Will display what is in the " "
 				System.out.println("You chose Multiplication");
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Prompting user to "Enter your first number"
 				System.out.print("Enter your first number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				firstNumber = keyboard.nextDouble();
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Prompting the user to "Enter your second number"
 				System.out.print("Enter your second number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				secondNumber = keyboard.nextDouble();
 			
 				//Calculating the answer of firstnumber - secondnumber
 				answer = firstNumber * secondNumber;
 				//display();
 				
 				//break statement
 				break;

  				//Case D
  				case 'D':
  				//Will display what is in the " "
  				System.out.println("You chose Division");
  			
  				//Displays a blank line for extra space
  				System.out.println();
  			
  				//Prompting user to "Enter your first number"
 				System.out.print("Enter your first number: ");
 				
 				//Will grab input from the keyboard that the user has type in
 				firstNumber = keyboard.nextDouble();
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Prompting the user to "Enter your second number"
 				System.out.print("Enter your second number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				secondNumber = keyboard.nextDouble();
 						
 				//Calculating the answer of firstnumber / secondnumber
 				answer = firstNumber / secondNumber;
 				//display();
 			
 				//break statement
 				break;
 				
 				
 				//Case X
 				case 'X':
				System.out.println("Thank you for using the Calculator Program!");
				
 				//User will be able to exit the program once X has been typed in			
 				System.exit(0);
 			
 				//break statement
 				break;
 			
 			//default message if none of the listed codes has been selected
 		 	default : System.out.println("Error you have not chosen any of the valid characters, please select A, B, C , D or X to quit the program");			
 			}
 		
 		//While statement
  		} while (menuCode != 'X');
  		
  		  		
 	} //End of main method

 	
	public static void addition(double firstNumber double secondNumber)
 	{
		double answer;
 		answer = firstNumber + secondNumber;
 		display(); 
 	}
 	public static void subtraction(double firstNumber double secondNumber)
 	{
		double answer;
 		answer = firstNumber - secondNumber;
 		display(); 		

 	}
	public static void multiplication(double firstNumber double secondNumber)
 	{
		double answer;
		answer = firstNumber * secondNumber;
 		display(); 		
	}	
	public static void division(double firstNumber double secondNumber)
 	{
		double answer;
		answer = firstNumber / secondNumber;	
 		display(); 		
 	}
	
 		
 	public static void display(double answer)
 	{
 		System.out.println("The answer is: " +answer);	
	}
 	
 	
 } //End of class
