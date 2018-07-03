/* Programmer: Broderick Higby
 * Program: GolfScoresVersion2.java
 * Date: 12 April 2015
 * Description: Shows the difference between golf scores and lists the average, uses PartiallyFilledArray.java as well, demonstrates
 * the use of Partially filled arrays and calling them 
 * 
 */
import java.util.Scanner;

/**
 Demonstrates Using the class PartiallyFilledArray,
*/
public class GolfScoresVersion2 //Start of class
{

    public static final int MAX_NUMBER_SCORES = 10; //establishes MAX_NUMBER_SCORES as a global constant of 10

    /**
     Shows the differences between each of a list of golf scores and their average.
    */
    public static void main(String[] args) //Start of main method
    {
    	//Creates score from the PartiallyFilledArray, using the MAX_NUMBER_SCORES constant as an argument
        PartiallyFilledArray score = 
                              new PartiallyFilledArray(MAX_NUMBER_SCORES);
        //Prompts user
        System.out.println("This program reads golf scores and shows");
        System.out.println("how much each differs from the average.");
        
        System.out.println("Enter golf scores:");
        fillArray(score); //creates fillArray variable and uses score array
        showDifference(score);  //Score is an array that's called
    }

    /**
     Reads values into the PartiallyFilledArray a.
    */
    //Start of fillArray method which creates 'a'; 'a' is equal to fillArray and has a double base type
    //Calls PartiallyFilledArray as an argument
    public static void fillArray(PartiallyFilledArray a)
    {
    	//a.length will return the length of the declared array a.getMaxCapacity
    	//getMaxCapacity returns the value of maxNumberElements
        System.out.println("Enter up to " + a.getMaxCapacity( ) 
                               + " nonnegative numbers, one per line.");
        System.out.println("Mark the end of the list with a negative number");
        Scanner keyboard = new Scanner(System.in);

        double next = keyboard.nextDouble( ); //next scans user input
        //In this while loop; while user input is greater than or equal to 0 AND does not equal a.full method, 
        //which is numberUsed== maxNumberElements in the PartiallyFilledArray class, it'll scan user input
        while ((next >= 0) && (!a.full( ))) 
        {
            a.add(next);
            next = keyboard.nextDouble( ); //next scans user input
        }

        if (next >= 0)
             System.out.println("Could only read in "
                                + a.getMaxCapacity( ) + " input values."); //getMaxCapacity method is equal to maxNumberElements
    }

    /**
     Returns the average of numbers in the PartiallyFilledArray a.
    */
    public static double computeAverage(PartiallyFilledArray a) //start of new method using 'a' PartiallyFilledArray 
    //as arguments within the parameters 
    {
        double total = 0; //The total variable is established and equal to 0
        for (int index = 0; index < a.getNumberOfElements( ); index++) //for loop calls method getNumberOfElements and increments
            total = total + a.getElement(index); //calculates total(0) + the number of indices in the array 'a' (10+0)

        if (a.getNumberOfElements( ) > 0) //if the numberUsed is greater than 0
        {
            return (total/a.getNumberOfElements( )); //Total is divided by numberUsed
        }
        else //Other statements aren't complied with
        {
            System.out.println("ERROR: Trying to average 0 numbers.");
            System.out.println("computeAverage returns 0.");
            return 0;
        }
    }

    /**
     Gives screen output showing how much each of the
     elements in the PartiallyFilledArray a differ from the average.
    */
    public static void showDifference(PartiallyFilledArray a) //showDifference method using 'a' as an argument
    {
        double average = computeAverage(a); //calls computeAverage method using a & numberUsed variable
        System.out.println("Average of the " + a.getNumberOfElements( ) //calls numberUsed 
                                  + " scores = " + average);
        System.out.println("The scores are:");
        for (int index = 0; index < a.getNumberOfElements( ); index++) //Calls numberUsed, and increments up the index by 1
            System.out.println(a.getElement(index) + " differs from average by " //The entered score differs from the average by... 
                                    + (a.getElement(index) - average)); //calculates each index - the average and repeats for all scores
    }

}
