/*----------------------------------------------------------
 *Program: ConstructorsDemo.java
 *Programmer: Broderick Higby
 *Date: 3/24/15
 *Description: This display contains a demonstration program
 *for the constructors defined in display 4.13
 *----------------------------------------------------------*/
 
 //public class name
 public class ConstructorsDemo
 {
 	//main method
 	public static void main(String[] args)
 	{
 		//calling overloaded constructors, so these are all the same
 		//methods, and they're overloading the class file
 		Date date1 = new Date("December", 16, 1770),
 			 date2 = new Date(1, 27, 1756),
 			 date3 = new Date(1882),
 			 date4 = new Date();
 		
 		//display messages inside the " "
 		System.out.println("Whose birthday is " + date1 + "?");
 		System.out.println("Whose birthday is " + date2 + "?");
 		System.out.println("Whose birthday is " + date3 + "?");
 		System.out.println("The default date is " + date4 + ".");
 		
 	} //end of main method
 	
 } //end of public class ConstructorsDemo
 