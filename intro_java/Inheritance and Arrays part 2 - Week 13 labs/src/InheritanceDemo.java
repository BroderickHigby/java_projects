/*--------------------------------------------
 *Program: Inheritance.java
 *Programmer: Broderick Higby
 *Date: 4/16/2015
 *Description: For this display we are working
 *with inheritance and how it works.
 *-------------------------------------------*/
 
 //public class name
 public class InheritanceDemo
 {
 	//main method
 	public static void main(String[] args)
 	{
 		//setting HourlyEmployee joe to new hourlyEmployee and setting 
 		//specific information that will be displayed
 		HourlyEmployee joe = new HourlyEmployee(" Joe Worker", 
 								new Date("January", 1, 2004), 50.50, 160);
 		
 		//displays the message and calling joe.getName 			
 		System.out.println("joe's longer name is " + joe.getName());
 		
 		//displays the message in the " "
 		System.out.println("Changing joe's name to Josephine.");
 		
 		//setting joe to a new name Josephine
 		joe.setName("Josephine");
 		
 		//displays the message inside the " "
 		System.out.println("joe's record is as follows:");
 		
 		//displays the regcord for joe
 		System.out.println(joe);
 		
 	} //end of main method
 	
 } //end of public class