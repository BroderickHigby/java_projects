/* Programmer: Broderick Higby
 * Program: Averager
 * Date: 1 March 2015
 * Description: A program that averages a list of scores and then uses loops 
 */
import java.util.Scanner;

public class Averager
{
        public static void main(String[] args) //begin main method
        {
                Scanner keyboard = new Scanner(System.in); //takes keyboard input
                System.out.println("Enter a list of non-negative scores");
                System.out.println("Mark the end with a negative number");
                System.out.println("I will compute their average. ");
                
                double next, sum=0; //next is a temporary variable, sum is more permanent across the program
                int count=0; // count is permanent as well.
                
                next = keyboard.nextDouble(); //The scanner reads the input and stores it as a double integer 
                
                while (next >= 0) //If the scores are above 0 the statement is true and executes until it's false 
                {
                        sum = sum + next; //Next plus sum equals sum
                        count++;
                        next = keyboard.nextDouble();  //The input to the next variable is read by nextDouble
                }
                
                if (count==0) //If there is no valid input, then the 'if' loop won't run .. and
                        System.out.println("No scores entered. "); //The 'if' condition will give a true evaluation and display this message.
                        
                else //If the while loop executes, then the 'else' instructions will execute
                {
                        double average = sum / count; //Equation that divides sum by count and equals the average
                        
                        System.out.println(count + " Scores read."); 
                        System.out.println("The average is " +average); //Displays the average 
                }
        } //End of main method
}//End of class 
