/**
 * Program Name: Show Interest
 * Programmer: Broderick Higby
 * 1/23/2015
 * Shows interest on an account balance
 */
package showInterest;

public class ShowInterest {
	//math function INTEREST_RATE
	public static final double INTEREST_RATE = 2.5;
	
	public static void main(String[] args)
	{
		double balance = 100;
		double interest; //as a percent
		
		interest = balance * (INTEREST_RATE / 100.0);

		System.out.println("On a balance of $" + balance);
		System.out.println("you will earn interest of $"
												+ interest);
		System.out.println("All in just one short year");
		//Geez, with those returns why wouldn't I invest?!
	}

}
