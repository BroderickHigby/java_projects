/*-------------------------------------------------
 *Program: Array5B.java
 *Programmer: Broderick Higby
 *Date: 4/10/15
 *Description: The Purpose of the Array5B is to demonstrate the
 *use of arrays being indexed and called at once. Also to demonstrate
 *the initialization of the array and then printing the elements 
 *of the array using salary values given in the project guidelines.
 *---------------------------------------------------*/

 //public class name
 public class Array5B
 {
 	//this is the main method
 	public static void main(String[] args)
 	{
 		//declaring the array for salary with the given values
 		//from our project 5 part A guidelines	
 		double[] salary = { 5.25,  6.55,  10.25,  16.85 };
 		 
 		//for loop for the index and increment operator of 
 		//the index to count up starting at the zero place
 		//holder of the array				 		
 		for (int index = 0 ; index < salary.length; index++)
 		{
 		
 		//will display the messages one by one for each value declared
 		//in the array
 		System.out.println("Salaries one by one are: " + salary[index]);
 		
 		} //end of for loop
 		
 	} //end of main method
 	
 } //end of public class
 