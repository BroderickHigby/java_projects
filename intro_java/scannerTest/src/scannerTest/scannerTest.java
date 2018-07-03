package scannerTest;

import java.util.*; //input java.util.Scanner;

public class scannerTest
{
public static void main(String[] args)
{
	int num = 0;
	double num2 = 0.0;
	String str, str1 =" ";
	
	Scanner input = new Scanner(System.in); 
			
			System.out.print("Enter a number:");
			num= input.nextInt();
			System.out.println("The number is: "+num);
			
			System.out.print("Enter a decimal number: ");
			num2=input.nextDouble();
			
			System.out.println("The decimal number is: " +num2);
			
			System.out.print("Enter a name: ");
			str = input.next();
			
			//System.out.print("Enter a name: ");
			str1 = input.nextLine();

			System.out.println("");
			System.out.println("The next() value is: " +str);
			System.out.println("");
			
			System.out.println("The nextLine() value is: " +str1);
			System.out.println("");
			
			
	}//End of main method			

}//End of class