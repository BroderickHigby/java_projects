/* Programmer: Broderick Higby
 * Program: VariableParameterDemo.java
 * Date: 12 April 2015
 * Description: Takes high scores for Tom, Dick, and Harriet, this demonstrates the use of the vararg statement and calls from the
 * UtilityClass.java which stores the vararg specification and returns it to the main method, outputting the highest score of the 
 * three inputs
 */
import java.util.Scanner;

public class VariableParameterDemo //Start of class
{

    public static void main(String[] args) //Start of method
    {
        System.out.println("Enter scores for Tom, Dick, and Harriet:"); //Prompts user
        Scanner keyboard = new Scanner(System.in); //They all scan user input
        int tomsScore = keyboard.nextInt( );
        int dicksScore = keyboard.nextInt( );
        int harrietsScore = keyboard.nextInt( );
        //Here's the money maker...max variable pulls the highest score out of the three user inputed values
        //highest score is created and uses the peoples scores as parameters 
        int highestScore = UtilityClass.max(tomsScore, dicksScore, harrietsScore);
        
        System.out.println("Highest score = " + highestScore); //Prints the highest score
        
    } //End of method
} //End of Class
