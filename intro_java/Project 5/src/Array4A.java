/*----------------------------------------------------------
 *Program: Array4A.java
 *Programmer: Broderick Higby
 *Date: 4/1/15
 *Description: This program demonstrates the declaration of an array, 
 *demonstrates the initialization of the array,
 *and demonstrates the printing of the elements of the array.
 *----------------------------------------------------------*/

public class Array4A//Beginning of Class
{

	public static void main(String[] args)//Beginning of Main Method
	{
		//Salary, is an array of a type double, that will hold 4 elements
		double[] salary;
		salary = new double[4]; //Salary array constructed 
		
		//Here, each of the indexes in the array are assigned a value
		salary[0] = 5.25;
		salary[1] = 6.55;
		salary[2] = 10.25;
		salary[3] = 16.85;
		
		//These statements will be printed to the screen, printing each indexes respective value
		System.out.println("The Salaries one by one are: ");
		System.out.println("Salary at index 0: " + salary[0]);
		System.out.println("Salary at index 1: " + salary[1]);
		System.out.println("Salary at index 2: " + salary[2]);
		System.out.println("Salary at index 3: " + salary[3]);
		
	}//End of Main Method

}//End of Class
