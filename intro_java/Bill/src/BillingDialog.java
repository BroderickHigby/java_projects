/*Program: Bill.java	
 *Programmer: Broderick Higby
 *Date: 3-22-2015
 *Description: */
public class BillingDialog 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the law offices of");
		System.out.println("Dewey, Cheatham, and Howe.");
		bill yourBill = new bill(); //instantiates new instance of bill
	
		//records user input from method in bill.java
		yourBill.inputTimeWorked(); 
		yourBill.updateFee(); 
		yourBill.outputBill();
		
		//Prints lines after calculation 
		System.out.println("We have placed a lien on your house"); 
		System.out.println("It has been our pleasure to serve you");
	}
}
