/*Program: Cable Company Billing Program
 *Programmers: Spencer Holloway, Jesse Leon, Brody Higby, Luis Sanchez
 *Date: 2-24-15
 *Description: This program will collect user input with regards to their account number,
  customer type,premium Channels and service connections to calculate ones overall bill.*/

 

import java.util.Scanner;//Allows us to utilize the Scanner Class

public class BillingProgram//Beginning of Class
{
 
  public static void main(String[] args)//Beginning of Method
  {
  
   Scanner keyboard = new Scanner (System.in);//Instantiates the Scanner Object
  
   //Here, the multiple variables are defined and assigned to a data type.
   char menuCode;
   double Channels;
   double billFee;
   double basicFee;
   double pChannels;
   double ChannelBill;
   double ServiceConnections;
   double Bill;
   int accountNumber;
  
   //This block of code will print the Customer Type Menu.
   System.out.println("-----------------------");
   System.out.println("Customer Type:");
   System.out.println("\nEnter R for Residential");
   System.out.println("\nEnter B for Business");
   System.out.println("-----------------------");
  
  
  
   System.out.println("Please enter your Account Number: ");//Prompts user to enter Account Number
   accountNumber = keyboard.nextInt();//Scans in entered value
  
   System.out.println("Please enter Customer Type: ");//Prompts user to enter Customer Type
  
  menuCode = keyboard.next().charAt(0);//Scans in entered character
  
   if (menuCode == 'R' || menuCode == 'r')//If R or r is entered, this calculation will be executed.
    {
      billFee = 4.50;
      basicFee = 20.50;
      pChannels = 7.50;
      
      System.out.println("Please enter the number of Premium Channels you have: ");//Prompts user to enter number of Premium Channels
      Channels = keyboard.nextDouble();//Scans in entered value
      
      ChannelBill = Channels*pChannels;
      
      Bill = ChannelBill + billFee + basicFee;
   
      System.out.println("Your bill is:$" + Bill);//Prints bill to screen
    }
  
  else if (menuCode == 'B' || menuCode == 'b')
   {
   
    System.out.println("Please enter the number of Basic Service Connections: ");//Prompts user to enter number of Basic Service Connections
    ServiceConnections = keyboard.nextDouble();//Scans in entered value
    
    if (ServiceConnections<=10)
     {
      basicFee = 75.00;
      billFee = 15.00;
      pChannels = 50.00;
      
      System.out.println("Please enter the number of Premium Channels you have: ");//Prompts user to enter number of Premium Channels
      Channels = keyboard.nextDouble();//Scans in entered value
      
      ChannelBill = pChannels*Channels;
      
      Bill = ChannelBill + billFee + basicFee;
    
      System.out.println("Your bill is:$" + Bill);//Prints bill to screen
     }
     
     else if (ServiceConnections>10)
     {
      basicFee = (5*ServiceConnections + 75.00);
      billFee = 15.00;
      pChannels = 50.00;
      
      System.out.println("Please enter the number of Premium Channels you have: ");
      Channels = keyboard.nextDouble();//Scans in entered value
      
      ChannelBill = pChannels*Channels;
      
      Bill = ChannelBill + billFee + basicFee;
      
      System.out.println("Your bill is:$" + Bill);//Prints bill to screen
    
    
     }
     
     
   }
    
  System.out.println("\nThank you for your Patronage.");
  
  }//End of Method
  
  
}//End of Class
 