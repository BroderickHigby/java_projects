/*;
 *
 *
 *
 * Group Project 2
 *
 * Programmers: Jonathan D Peterson, Oscar Labrador, Cedric Miller, 
 * Broderick Higby, Chauncy  Sapien
 *
 * Algorithm
 * -  Create while loop to get use input for the amount to be put into 
 *    savings account
 * - The prompt for the input should read 'Enter in a coin value: '
 * - Implement error checking via CoinValueExcption for a valid coin value.
 * - Give user 2 chances on putting correct values, after that exit.
 *	 This is done using a counter and if it becomes bigger. 
 * - Ask for a coin name, and implement error checking to see if the coin 
 *   name is correct.
 * - Ask user if they want to keep adding to savings account?
 * - 
 *
 *
 *
 */
 import java.util.Scanner;
 
 
 public class CoinDemo
 {
 	
 	public static final double QUARTER = .25;
 	public static final double DIME = .10;
 	public static final double HALF_DOLLAR = .50;
 	public static final double NICKEL =  .05;
 	public static final double PENNY = .01;
 	public static String coinName="";
 	public static double coinValue=0.0;
 	public static double purse =0.0;
 	boolean keepGoing = true;
 	public static int nickelCount, quarterCount, pennyCount, dimeCount;
 	public static int numberOfTries; 
  	public static void main(String[] args)
  	{ 

        while(numberOfTries < 2)
        {
	  		try
	   		{
	  		enterCoinValues();
	  		}
	        
	  		catch(CoinValueException e)
	  		{
	            if(numberOfTries == 1)
	            {
	  			System.out.println(e.getMessage());
	            }
	            else if(numberOfTries == 2)
	            {
	            	PurseExit();
	            }
	  		}
        }
  	}
  	
  	public static void enterCoinValues() throws CoinValueException
    {
     Scanner input = new Scanner(System.in);	
			
	 System.out.print("What coin do you want to put in your purse?");
 	 System.out.print("Type in as many coins as you want: quarter, dime, nickel, penny:");
 	 System.out.print("When you're finished type: Done son");
 			coinValue = input.nextDouble();
  			input.nextLine();
  			if(coinValue == QUARTER) 
  			{
  				coinName = "Quarter";
  				quarterCount++;
  					
  			}
  			else if(coinValue == DIME) 
  			{
  				coinName = "Dime";
  				dimeCount++;
  					
  			} 
  			else if(coinValue == NICKEL) 
  			{
  				coinName = "Nickel";
  				nickelCount++;
  				
  					
  			}
  			else if(coinValue == PENNY) 
  			{
  				coinName = "Penny";
  				pennyCount++;
  					
  			}
  			else
  			{
  				throw new CoinValueException();
  			}
     }
  	public static void PurseExit()
  	{
  		System.out.println("Ya dun messed up too many times kid, the program is terminating like Arnold Schwarzenegger");
  		System.exit (0);
  	}
 }