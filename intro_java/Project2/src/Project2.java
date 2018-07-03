/*Program: Project 2
 
 *Programmer: Broderick Higby
 
 *Date: 2-5-15
 
 *Description: This program will read from a text in file and write to a text out file*/ 
 
 
 
//These import statements allow us to utilize the Scanner class and io stream.
 
import java.util.*;
 
import java.io.*;
 
import javax.swing.JOptionPane;


public class Project2 //Beginning of Class
 
{
 



 public static void main(String[] args) throws FileNotFoundException //Beginning of method
 
 {
 
  
 
 FileReader JavaProject = new FileReader("testscores.txt");//computer will read from this file
 
 Scanner inFile = new Scanner(JavaProject);
 
 PrintWriter outFile = new PrintWriter("testAvg.txt");//computer will write to this file
 
  
 
 String firstName = inFile.next();//From the inFile, the variable firstName is read
 
  
 
 String lastName = inFile.next();//From the inFile, the variable lastname is read
 
  
 
 //These 5 values, defined with the double data type are read from the testscores file.
 
 double test1 = inFile.nextDouble();
 
     
 
 double test2 = inFile.nextDouble();
 
  
 
 double test3 = inFile.nextDouble();
 

 
 double test4 = inFile.nextDouble();
 
     
 
 double test5 = inFile.nextDouble();
 
      double average;//Here, the variable average is defined as a double value.
 
 outFile.println("Spencer Holloway");//This name will be printed to the testAvg file
 
     
 
 outFile.printf("%5.2f %5.2f %5.2f %5.2f %5.2f", test1, test2, test3, test4, test5);//These values will be printed to the testAvg file.
 
     
  average = (test1 + test2 + test3 + test4 + test5) /5.0;//This will compute the average that will vary with the different test scores.
 
 
 outFile.printf("%nAverage %5.2f %n", average);//The computed average is 85. This value will be printed to the testAvg file.
 
 String message = " ";//Creates a String variable to hold the message.
 
 //Data Items are Concatenated into the message.
 message = message + "Name :" + firstName + " " + lastName + "\n";
 
 message = message + "Test Scores: " + test1 + " " + test2 + " " + test3 + " " + test4 + " " + test5 + "\n";
 
 //Shows message in a Dialog Box.
 JOptionPane.showMessageDialog(null, message, "Wages", JOptionPane.INFORMATION_MESSAGE);
  
 inFile.close();//end scanning inFile
 
 outFile.close();//end writing to outfile
 
  
 
 
 
 
   }//end of method
 
 
 
}//end of class