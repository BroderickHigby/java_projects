/* Chapter No.  11 Exercise No. 1  
File Name:          Fact.java
Programmer:         Broderick Higby
Date Last Modified: October 22, 2015

Problem Statement: write recursive method to calculate user 
inputted factorial numbers

Algorithm:
1. Factorial class will take user inputted number 
2. The base class will return 1
3. n multiplied by the factorial class - 1 making it recursive
4. continues until it reaches 1 or 0 
*/
import java.util.Scanner;

public class Fact 
{
	public static void main(String[] args)
	{
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Welcome to factorials, Please enter a number");
		int n = keyboard.nextInt();
		System.out.println(Fact.factorial(n));
	}
	public static int factorial(int n)
	{
		if(n==1 || n== 0)
		{
			return 1;
		}
	return n * factorial(n-1);
	}
}
