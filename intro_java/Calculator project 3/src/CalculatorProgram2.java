/*----------------------------------
 *Program: CalculatorProgram.java
 *Programmer: Jesse Leon
 *Date: 02/21/2015(Modified 
 *Description: For this program we will be creating a calculator program that 
 *will add, subtract, multiply, and divide. We will create the program to prompt
 *the user and to take the users input to determine which calculation to use and 
 *then two more input numbers to carry out the calculations. We will be using
 *nested if else statements to determine the users choice. If the user does not
 *input a designated letter that is provided there will be a error message displayed.
 *-----------------------------------------*/
 
  //Will be using the java.util.Scanner for this project
 import java.util.Scanner;
 import java.io.*;
 
 //This is my class header
 public class CalculatorProgram2
 {
		double firstnumber, secondnumber, answer;
	 
 	//This is my main method
 	public static void main(String[] args)
 
 	{
 		//Instantiating scanner
 		Scanner keyboard = new Scanner(System.in);
 		
 		//Declaring variables char, double, int
 		char menuCode;
 		double firstnumber, secondnumber, answer;
 		int ch;
 		 	
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
 		
 		//converts all case letters to upcase entries
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
 				firstnumber = keyboard.nextDouble();
 			
 				System.out.println();
 			
 				//Prompting the user to "Enter your second number"
 				System.out.print("Enter your second number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				secondnumber = keyboard.nextDouble();
 			
 				//Calculating the answer of firstnumber + secondnumber
 				answer = firstnumber + secondnumber;
 			
 				System.out.println();
 			
 				//Displaying to the user "Your answer is" + answer 
 				System.out.println("Your answer is: " + answer);
 			
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
 				firstnumber = keyboard.nextDouble();
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Prompting the user to "Enter your second number"
 				System.out.print("Enter your second number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				secondnumber = keyboard.nextDouble();
 			 			 			
 				//Calculating the answer of firstnumber - secondnumber
 				answer = firstnumber - secondnumber;
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Displaying to the user "Your answer is" + answer 
 				System.out.println("Your answer is: " + answer);
 			
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
 				firstnumber = keyboard.nextDouble();
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Prompting the user to "Enter your second number"
 				System.out.print("Enter your second number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				secondnumber = keyboard.nextDouble();
 			
 				//Calculating the answer of firstnumber - secondnumber
 				answer = firstnumber * secondnumber;
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Displaying to the user "Your answer is" + answer 
 				System.out.println("Your answer is: " + answer);
 			
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
 				firstnumber = keyboard.nextDouble();
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Prompting the user to "Enter your second number"
 				System.out.print("Enter your second number: ");
 			
 				//Will grab input from the keyboard that the user has typed in
 				secondnumber = keyboard.nextDouble();
 						
 				//Calculating the answer of firstnumber / secondnumber
 				answer = firstnumber / secondnumber;
 			
 				//Displays a blank line for extra space
 				System.out.println();
 			
 				//Displaying to the user "Your answer is" + answer 
 				System.out.println("Your answer is: " + answer);
 			
 				//break statement
 				break;
 				
 				
 				//Case X
 				case 'X':
 				
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
 	public double addition()
 	{
 		answer = firstNumber + secondNumber
 		return = answer 	
 	}
 	public double subtraction()
 	{
 		answer = firstNumber - secondNumber
 		return = answer 	
 	}
	public double multiplication()
 	{
		answer = firstNumber * secondNumber
 		return = answer 	
 	}	
	public double division()
 	{
		answer = firstNumber / secondNumber
 		return = answer 	
 	}
	
 		
 	public double display()
 	{
 		System.out.println("The answer is: " +answer);
 		return = answer;
 	}
 		} //End of switch statement
 	}
 } //End of clas