/* Chapter No.  11 Exercise No. 1  
File Name:          Shakes.java
Programmer:         Broderick Higby
Date Last Modified: October 22, 2015

Problem Statement: write recursive method to calculate user
inputted number of hand shakes

Algorithm:
1. Hands class will take user inputted number 
2. The base class will return 1
3. n minus 1 + the hands class (n - 1) makes it recursive
4. continues until it reaches 1 or 0 
*/
import java.util.*;
public class Shakes 
{
	public static void main(String[] args)
	{
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Welcome to Shake it off, Please enter a number: ");
		int n = keyboard.nextInt();
		System.out.println(Shakes.hands(n));
	}
	public static int hands(int n)
	{
		if(n==1)
		{
			return 0;
		}
		if(n==2)
		{
			return 1;
		}
		
		return (n-1)+(hands(n-1));
	}
}
