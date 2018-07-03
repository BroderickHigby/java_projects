/* Programmer: Broderick Higby
 * Program: UtilityClass.java
 * Date: 12 April 2015
 * Description: Demonstrates the use of the vararg specification to determine the max score for the person in the main method
 * and is called by the VariableParameterDemo class and 
 */
public class UtilityClass 
{
    /**
     Returns the largest of any number of int values.
    */
	/*Vararg specs...fun stuff; so with this you can change the parameters to whatever within the array name given they're the 
	*same data type. So here the max method uses int data type and arg is an array name and can have multiple parameters
	*/
   public static int max(int... arg) 
    {
        if (arg.length == 0) //The length of the array is set to 0 here
        {
           System.out.println("Fatal Error: maximum of zero values."); //Oh no!!! :O
           System.exit(0);
        }

        int largest = arg[0]; //largest is declared and the array starts at 0 index
        for (int i = 1; i < arg.length; i++) //for loop indexes the array 'arg' plus 1 
            if (arg[i] > largest) //if arg array indices is greater than 'largest' variable 
                largest = arg[i];//Then largest variable equals arg array +1 
        return largest; //return the output stored in the largest variable
    }
}