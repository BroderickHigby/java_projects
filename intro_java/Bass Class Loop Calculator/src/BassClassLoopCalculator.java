/*----------------------------------
 *Program: BassClassLoopCalculator.java
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


 //This is my class header
public class BassClassLoopCalculator
 {
	double firstNumber, secondNumber, Total;	
	double addition, subtraction, multiplication, division;
		//Each equation is its own method 
		public void addition(double firstNumber, double secondNumber)
			{
				double Total; 
				Total = firstNumber + secondNumber;
				display(Total); //Goes to 'display' method
			}
		
		public void subtraction(double firstNumber, double secondNumber)
			{
				double Total;
				Total = firstNumber - secondNumber;
				display(Total);
			}
		
		public void multiplication(double firstNumber, double secondNumber)
			{
				double Total;
				Total = firstNumber*secondNumber;
				display(Total);
			}
		
		public void division(double firstNumber, double secondNumber)
			{
				double Total;
				Total = firstNumber/secondNumber;
				display(Total);
			}
		
		public void display( double Total)
			{
			System.out.println("The total is " + Total);
			}		
		
} //End of class
