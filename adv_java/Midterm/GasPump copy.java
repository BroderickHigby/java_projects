/*Broderick Higby
 * Algorithm:
 *- Create gas pump base class and serialized class
 *-Display welcome message and request 8-digit card number\
 *-
 *-Create credit card method using Scanner that accepts the credit card number from a user, 
 *-Put the credit card method inside of a try-catch block and use a delimiter, then parse the numbers
 *
 *-Throw an exception if the numbers aren't entered in correctly the first time,
 *-Creae an exception class that extends the main class and send them to it using an if-else and the 
 *		throw new GasException() method.
 *-Bring them back in to have a second chance by using the continue keyword 
 * 	in the catch block and the finally keyword to reenter the numbers a second time.
 *-Make sure the credit card object is a private instance variable, and store it in a binary file
 *	using ObjectOutputStream
 *-fuelDispense() Tells the customer to press "G" to start pumping gas
 *-when the customer is finished they type -1
 *-The gas amount is being tracked as they pump 
 *-Once the user enters -1, termination() is called and sends users to transactionNum()
 *-TransactionNum assigns the customer a transacation # (hardcoded) then sends them to TotalGas()
 *-TotalGas() is called and amount is displayed based on the number of "g"'s they've entered ($.10 for each "G")
 *-CostPerGal() will have the total cost divided by the total gas price / number of gallons (10 G's)
 *-Amount is reset by setting runningGasPrice = 0;
 *-Display the output on the screen of the customers transaction #, 
 *   credit card number, price per gallon, gallons purchased, and cust. total cost
 *- 
 */
public class GasPump {

	public static void main (String[] args)
	{
		//Variables
		String gasPump;
		String 
	}
}