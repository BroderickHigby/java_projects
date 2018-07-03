
/*
 * 
 * 
 * Algorithm
 * - Create constants to be used for the coin value
 * - Prompt user to enter a coin value
 * - Put in error checking to see if coin value is valid
 * - if there is to invalid entries, then exit the program
 *   and give the user info on the coins they entered.
 *   
 * 
 * 
 */

import java.util.Scanner;

public class CoinDemo {

	public static final double QUARTER = 0.25;
	public static final double DIME = 0.10;
	public static final double NICKEL = .05;
	public static final double PENNY = .01;

	public static void main(String[] args) {

		int[] coins;
		String coinDeposited;
		Scanner input;
		int tries;
		double total;

		input = new Scanner(System.in);
		tries = 0;
		coins = new int[4];
		coins[0] = 0;
		coins[1] = 0;
		coins[2] = 0;
		coins[3] = 0;
		coinDeposited = "";
		total = 0;

		do {
			System.out.print("Enter coin value or name: ");
			try {
				coinDeposited = input.nextLine();
				if (!coinDeposited.equals("Quarter") && !coinDeposited.equals("Dime") && !coinDeposited.equals("Nickel")
						&& !coinDeposited.equals("Penny"))
					throw new CoinNameException();
				else if (!coinDeposited.equals(".25") && !coinDeposited.equals(".10") && !coinDeposited.equals(".05")
						&& !coinDeposited.equals(".01"))
					throw new CoinValueException();

			} catch (CoinValueException e) {
				tries++;
				System.out.println(e.getMessage());
			} catch (CoinNameException e) {
				tries++;
				System.out.println(e.getMessage());
			}

			if (coinDeposited.equalsIgnoreCase("Quarter") || coinDeposited.equals(".25")) {
				coins[0]++;
			} else if (coinDeposited.equalsIgnoreCase("Dime") || coinDeposited.equals(".10")) {
				coins[1]++;
			} else if (coinDeposited.equalsIgnoreCase("Nickel") || coinDeposited.equals(".05")) {
				coins[2]++;
			} else if (coinDeposited.equalsIgnoreCase("Penny") || coinDeposited.equals(".01")) {
				coins[3]++;
			}

		} while (tries != 2);
		total = (coins[0] * QUARTER) + (coins[1] * DIME) + (coins[2] * NICKEL) + (coins[3] * PENNY);
		System.out.println("You depositied " + coins[0] + " quarters, " + coins[1] + " dimes, " + coins[2]
				+ " nickels and " + coins[3] + " pennies for a total or $" + total);
	}

}
