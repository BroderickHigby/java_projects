/**
 *Programmer: Broderick Higby
 *Program:Calculator Test Project
 *Date: 22 February 2015
 * Description: A Java application that compares three string statements to each other then produces results based
 * on if/else comparison statements. */
import java.io.*;
import java.util.Scanner;
//import java.scanner.*;

public class calculatorTest {
	public static void main(String[]args) throws IOException
	{
		/*
		private static void readNumber(){
			while ((b = System.in.read()) != '\n')
	System.out.print((char) b);
	System.out.println("");	

		}		
		*/
		System.out.println("Calculator Program");
		System.out.println("------------------------------------\n");
		System.out.println("a.Add");
		System.out.println("b.Subtract");
		System.out.println("c.Multiply");
		System.out.println("d.Divide");
		System.out.println("------------------------------------\n");
		
		String num1;
		String num2;

	 Scanner scanner = new Scanner(System.in);
		
	
	System.out.println("Please make a selection:\n");
		/*char add = (char)	System.in.read();
		char subtract = (char) System.in.read();
		char multiply = (char) System.in.read();
		char divide = (char) System.in.read();
		*/

		int a;
		int b;
		int c;
		int d;
		
		/*int a = (add);
		int b = (subtract);
		int c = (multiply);
		int d = (divide); */
		
	System.out.println("Please enter the first number:\n");
			num1 = scanner.nextLine();
	


	System.out.println("Please enter the second number:\n");
			num2 = scanner.nextLine();

			
		//Answer
			if	(a == add) 
				System.out.printf("%d + %d", num1, num2);
			if	(b == subtract)
			   	System.out.printf("%d - %d", num1, num2);
			if	(c == multiply)
				System.out.printf("%d * %d", num1, num2);
			if (d == divide)
				System.out.printf("%d / %d", num1, num2);
;
			System.out.println("Game over bitch");


	}
}
