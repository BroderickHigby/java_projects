/**
 *Programmer: Broderick Higby
 *Program:Calculator Test Project
 *Date: 22 February 2015
 * Description: A Java application that gives the result of an equation based on user input and operation choice. */
import java.io.*;
import java.util.Scanner;

public class Calculator { //Start of Main Method
    
    
    public static void main(String[]args) throws IOException
    {       
        
        // This is pretty straight forward, we just give the user some hints.        
        System.out.println( "\tCalculator Program - supported operations");
        System.out.println( "\n------------------------------------");
        System.out.println( "\n\t+ Add");
        System.out.println( "\n\t- Subtract");
        System.out.println( "\n\t* Multiply");
        System.out.println( "\n\t/ Divide");
        System.out.println( "\n------------------------------------\n");
        
        // Important notice, scanner and system.in.read() hate each other, using them together will mess up EVERYTHING
    
        // we will divide our program into two blocks.
        // the final solution I came up with is to read all inputs as strings with the scanner class first
        // Declare the input variables, the two numbers and the operation
        
        String num1;
        String num2;
        String op;

        // we need to create a scanner instance with the Scanner type
        // we will refer to it with the sc variable name
        // remember the syntax, which is... 
        // variableType variableName = value;  // Whereas we need to create a new instance with the "new" operator.
        //It seems the Scanner class needs System.in as argument to use the console.
        Scanner sc = new Scanner(System.in);

        // now that we have the scanner, we can use it, even multiple times.
        // after compiling, it returns us a string
        System.out.print( "Please enter the first number:");
        num1 = sc.nextLine();

        System.out.print( "Please enter the second number:");        
        num2 = sc.nextLine();
        
        System.out.print( "Please enter what mathematical operation we should use (+,-,/,or *:");        
        op = sc.nextLine();

        // Finally we have all input in strings, thank you scanner class! 
        // If we would add strings, they would be concatenated. We want to use the INTEGER operations to add/subtract/multiply/divide
        // those are all defined for numbers. So let us define our numbers!

        int n1; //integer strings defined
        int n2;

        // We could probably use the casting, but parseInt seems to be the proper way. 
        // However parseInt will drop an exception, and crash the app unless caught if we can't convert the string, but lets try!        
        try {    
            // n1 and n2 are int's num1 and num2 are strings
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            // This block comes alive if the parse throws an error
            System.out.println( "Sorry, aJava could not parse one of your numbers ..");  
            //We return nothing to exit, as the main function returns void.
            return;
        }
        
        // We want to have the result as an integer. This must be initialized 
        int rs = 0;

        // lets check if we had some valid operators as input, || means logical "or"        
        if (op.equals( "+") || op.equals( "-") || op.equals( "*") || op.equals( "/")) 
        {

			if (op.equals( "+")) rs = n1 + n2;
            if (op.equals( "-")) rs = n1 - n2;
            if (op.equals( "*")) rs = n1 * n2;
            if (op.equals( "/")) rs = n1 / n2;
       //Please don't hate me for having them select an operation! I'll change it and try again if you want:-)  
            // we will display the result as a nice formatted text.        
            System.out.println( "According to Java and basic mathematics..." + num1 + op + num2 + "=" + rs);
                        return;
        }
        else 
        {
            // This block comes alive if none of the equals result true between the || blocks 
            System.out.println( "According to mathematics..." + op + " is not a valid operation.");
        }
    }	//End of main method
}	//End of class
