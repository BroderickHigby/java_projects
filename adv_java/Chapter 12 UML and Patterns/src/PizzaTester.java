/* Chapter No. 11 - Exercise No.  2
   File Name:          PizzaTester.java
   Programmer:         Broderick Higby
   Date Last Modified: November 3, 2015

   Problem Statement: (what you want the code to do)
   Create a program that displays a pizza menu and takes a pizza order 
   using the UML diagram
   
   Overall Plan (Algorithm - step-by-step plan to make it happen):
   1. Menu is displayed to user
   2. User inputs pizza size and if they want selected toppings
   3. In the Pizza class have the size and number of toppings set
   4. Get the toppings and return the private boolean 
   5. In the order class have the calcCost take in all the toppings and the total cost
   6. Return the calculated cost to the user after they're done inputting pizzas

*/

import java.util.Scanner;

public class PizzaTester 
{
	public static void main(String[] args)
	{

		System.out.println("Welcome to Broderick's Fine Italian Pizza restaurant\n");
		
		PizzaOrder order = new PizzaOrder();
		
		order.pizzaMenu();
		order.customPizza();
	}
}