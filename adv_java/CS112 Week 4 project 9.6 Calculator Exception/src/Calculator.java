/* Chapter No. 9 - Exercise No. 6
   File Name:          Calculator.java
   Programmer:         Broderick Higby
   Date Last Modified: September 22, 2015

   Problem Statement: (what you want the code to do)
   To make a simple calculator that will allow input an operator and a number 
   from the user. If the user inserts an incorrect operator, it will throw an
   exception.
   
   
   Overall Plan (step-by-step, how you want the code to make it happen):
   1.Create all variables that store answers and result
   2.Make an intro into the calc
   3.Create 2 while loops, one to end program and one to reset.
   4.Use try/catch for operation of equation
   5.Store user answer into 2 variables, 1 for op and 1 for number input.
   6.Use nested if statements for which operator to use on the result.
   7.Throw exception if not +,-,*,/
   8.Print out results answers
   9.Make exception class for thrown objects.
   10.output final answer.

   Classes needed and Purpose (Input, Processing, Output)
   main class - Calculator
   Exception class - UnknownOperatorException
*/


import java.util.*;
public class Calculator
{
	public static void main(String[] args)
	{
		double result = 0.0;
		Scanner keyboard = new Scanner(System.in);
		boolean done = false;
		String equation = "";
		String operatorUsed;
		double numberUsed;
		String escapeOutterLoop;
		
		System.out.println("Calculator is on.");
		System.out.println("You can enter your equations below.");
		System.out.println("Example: +5. This will equal result plus 5.");
		System.out.println("Type 'R' to be done.");
		System.out.println();
		System.out.println();
		System.out.println("Start here:");

		while(!done)
		{
			result = 0.0;
			System.out.println("Result = 0.0");
			equation = "";
			
			while(!equation.equalsIgnoreCase("r"))
			{
				try
				{
					equation = keyboard.nextLine();
					equation.trim();
					
					if(!equation.substring(0,1).equalsIgnoreCase("r"))
					{
						operatorUsed = equation.substring(0,1);
						numberUsed = Integer.parseInt(equation.substring(1));
						if(operatorUsed.equals("+")||operatorUsed.equals("-")||
							operatorUsed.equals("*")||operatorUsed.equals("/"))
						{
							if(operatorUsed.equals("+"))
							{
								result += numberUsed;
							}
							else if(operatorUsed.equals("-"))
							{
								result -= numberUsed;
							}
							else if(operatorUsed.equals("*"))
							{
								result *= numberUsed;
							}
							else
							{
								result /= numberUsed;
							}
						}
						else
						{
							throw new UnknownOperatorException(
								"That's not a correct operator! Repeat last line.");
						}
						
						System.out.println("Equation:");
						System.out.println("Result " + operatorUsed + " " + numberUsed +
										" = " + result);
					}
					
					
					
				}
				catch(UnknownOperatorException e)
				{
					String message = e.getMessage();
					System.out.println(message);
				}
			}
			System.out.println("Final Result = " + result);
			System.out.println();
			System.out.println("Start over? Y/N");
			escapeOutterLoop = keyboard.nextLine();
			if(escapeOutterLoop.equalsIgnoreCase("N"))
			{
				System.out.println("Thanks for using this Calc!");
				System.out.println("Shutting down.");
				done = true;
			}
			
			
		}
	}
}