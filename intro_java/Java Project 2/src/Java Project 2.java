/**
 *Programmer: Broderick Higby
 *Program:Java Project 2
 *Date: 5 February 2015
 * Desciption: A Java application that reads data from an "in" text file
 *to write processed data to an "out" text file. */
package javaProject2

import java.io*,;
import java.util*,;
import java.io.FileNotFoundException*; //These are the packages required for the program


public class javaProject2
{
    public static void main(String[] args) throws FileNotFoundException
    {		//Shows that input file doesn't exist
        
        Scanner inFile = new Scanner(new FileReader("test.txt") );
        //This declares inFile and initializes it using Scanner
        
        PrintWriter outFile = new PrintWriter("testAvg.txt");
        //OutFile prints to external file
        
        
        String firstName = inFile next();
        String lastName = inFile next();
        //These declare and initialize the firstName and lastName variables
        
        
        double test1 = inFile.nextDouble();
        double test2 = inFile.nextDouble();
        double test3 = inFile.nextDouble();
        double test4 = inFile.nextDouble();
        double test5 = inFile.nextDouble();
        //This part declares all the test variables, (they're "double", because they need more bytes) and then scans them in
        
        outFile.println(firstName);
        outFile.println(lastName);
        //Prints the name to the outgoing document
        
        outFile.printf("The test scores are %6.2f,%6.2f,%6.2f,6.2f,6.2f %n", test1, test2, test3, test4, test5);
        //Gives a printout of the test scores
        
        doubleavg1 = test1+test2+test3+test4+test5;
        double avg = avg1/5;
        //computes the avg
        
        outFile.printf("The test average is %6.2f", avg);
        //printout
        
        inFile.close();
        outFile.close();
        //Closes the inFile and outFile so they won't be changed
        
    } //Closes method
} //Closes class