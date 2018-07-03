/**
 *Programmer:Broderick Higby
 *Program: ComparingStrings
 *Date: 22 February 2015
 * Description: A Java application that compares three string statements to each other then produces results based
 * on if/else comparison statements. */
public class ComparingStrings {
	public static void main(String[]args)	//Begin main method
	{
		String s1 = "Java isn't just for breakfast."; 	//Sets the variable s1 to text line
		String s2 = "JAVA isn't just for breakfast."; 	//Sets the variable s2 to text line
		
		if	(s1.equals(s2))	//'if' statement is a boolean statement, saying if s1 equals s2 then print the line 
			System.out.println("The two lines are equal.");
		else	//else statement says that if the 'if' statement doesn't equal s1, then print the else statement 
			System.out.println("The two lines are not equal.");
		if	(s2.equals(s1))	//if the code executed through the previous two if statements and they weren't equivalent then
			//the compiler will ask if s2 is equal to s1; if not then it will proceed onto the 'else' statement
			System.out.println("The two lines are equal.");
		else //prints else statement if 'if' statement isn't complied with 
			System.out.println("The two lines are not equal.");
		if (s1.equalsIgnoreCase(s2)) //Tests strings for equality, compares two strings ignoring case
			System.out.println(
					"But the lines are equal, ignoring case.");
		else
			System.out.println(	
					"Lines are not equal, even ignoring case.");	//If it goes through the 'if' equals statement including ignoring case, and they're still
																	//not equal then the adjacent line is printed 
		String s3 = "A cup of java is a joy forever.";	//The third string
		if (s3.compareToIgnoreCase(s1) < 0)	
			//compares the calling object string to the string argument, ignoring case, to see which one comes first alphabetically 
		{
			System.out.println("\""+ s3 +"\""); 
			System.out.println("precedes");		//Produces line given the 'if' statement is complied with  
			System.out.println("\""+ s1 +"\"");
			System.out.println("in alphabetic ordering");	//Produces line given the 'if' statement is complied with
		}
		else
			System.out.println("s3 does not precede s1."); //else statement is printed if compareToIgnoreCase is not complied with 
	}	//End of main method
}	//nd of class
