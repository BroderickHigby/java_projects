/* Programmer: Broderick Higby
 * Program: GolfScores.java
 * Date: 3 April 2015
 * Description: Shows the difference between golf scores and lists the average
 */
import java.util.Scanner;

public class GolfScores
{
    public static final int MAX_NUMBER_SCORES = 10; //establishes MAX_NUMBER_SCORES as a global constant of 10

    /*
    *Shows differences between each of a list of golf scores and their average.
    */
    public static void main(String[] args) //Start of main method
    {
    	//score array, max number scores 
        double[] score = new double[MAX_NUMBER_SCORES]; //The array score is declared 
        int numberUsed = 0; //numberUsed variable declared and set to 0 

        System.out.println("This program reads golf scores and shows"); //Displays what to do
        System.out.println("how much each differs from the average.");

        System.out.println("Enter golf scores:"); //Prompts user 
        numberUsed = fillArray(score); //creates fillArray variable and uses score array
        showDifference(score, numberUsed); //Score is an array that's called and numberUsed is a called variable
    }

    /*
    *Reads values into the array a. Returns the number of values placed in the array a.
    */
    //Start of fillArray method which creates 'a'; 'a' is equal to fillArray and has a double base type  
    public static int fillArray(double[] a) //Start of fillArray method 'a' is 
    {
    	//a.length will return the length of the declared array a 
        System.out.println("Enter up to " + a.length //a.length=fillArray=score=MAX_NUMBER_SCORES=10	
                               + " nonnegative numbers.");
        System.out.println("Mark the end of the list with a negative number.");
        Scanner keyboard = new Scanner(System.in);

        double next; 
        int index = 0;
        next = keyboard.nextDouble( ); //next scans user input
        //Basically while "user input" is greater than or equal to 0 AND 0 is less than 10
        while ((next >= 0) && (index < a.length)) 
        {
            a[index] = next; //next will take the index 0 in the array
            index++;	//Then it'll start counting upwards, as long as index is below 10 it'll keep counting
            next = keyboard.nextDouble( ); 
           //index is the number of array indexed variables used so far.
        }
       //index is the total number of array indexed variables used.

        if (next >= 0) //If user input(next) = is greater than or equal to 10 starting from 0... 
             System.out.println("Could only read in " //...You get this output
                                + a.length + " input values.");

        return index; //returns the values 0-9 out of the method
    } 

    /**
     Precondition: numberUsed <= a.length.
                   a[0] through a[numberUsed-1] have values.
     Returns the average of numbers a[0] through a[numberUsed-1].
    */


    public static double computeAverage(double[] a, int numberUsed) //start of new method using 'a' and creating numberUsed array
    {
        double total = 0; //The total variable is established and equal to 0
        for (int index = 0; index < numberUsed; index++) //for loop initializes array element numberUsed 
            total = total + a[index]; //calculates total(0) + the number of indices in the array 'a' (10+0)
        if (numberUsed > 0) //if the numberUsed is greater than 0
        {
            return (total/numberUsed); //Total is divided by numberUsed
        }
        else //Other statements aren't complied with
        {
            System.out.println("ERROR: Trying to average 0 numbers."); 
            System.out.println("computeAverage returns 0.");
            return 0;
        }
    }
 

    /**
     Precondition: numberUsed <= a.length.
                   The first numberUsed indexed variables of a have values.
      Postcondition: Gives screen output showing how much each of the first
      numberUsed elements of the array a differ from their average.
    */
    public static void showDifference(double[] a, int numberUsed) //showDifference method declared(score array, numberUsed)
    {
        double average = computeAverage(a, numberUsed); //calls computeAverage method using a & numberUsed variable
        System.out.println("Average of the " + numberUsed //calls numberUsed 
                                             + " scores = " + average); 
        System.out.println("The scores are:"); 
        for (int index = 0; index < numberUsed; index++) //Calls numberUsed, and increments up the index by 1
       
        	System.out.println(a[index] + " differs from average by " //The entered score differs from the average by... 
                                    + (a[index] - average)); //calculates each index - the average and repeats for all scores
    }
}

