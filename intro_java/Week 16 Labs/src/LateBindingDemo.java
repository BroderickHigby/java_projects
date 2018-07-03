/*------------------------------------------------------------
 *Program: LateBindingDemo.java
 *Programmer: Jesse Leon
 *Date: 4/28/15
 *Description: For this demo we will be using the other methods
 *declared in our base classes to calculate whether or not
 *the sales for certain items are cheaper or if they are equal
 *priced deals.
 *------------------------------------------------------------*/
 
 /**
  *Demonsrates late binding.
  */
  
  //class name
  public class LateBindingDemo
  {
  	//main method
  	public static void main(String[] args)
  	{
  		//one item at $10.00
  		Sale simple = new Sale("floor mat", 10.00);
  		
  		//one item at $11.00 with a 10% discount
  		DiscountSale discount = new DiscountSale("floor mat", 11.00, 10);
  		
  		//display message
  		System.out.println(simple);
  		
  		//display message
  		System.out.println(discount);
  		
  		//if statement
  		if (discount.lessThan(simple))
  		
  			//display message
  			System.out.println("Discounted item is cheaper.");
  		//else statement	
  		else
  			//display message
  			System.out.println("Discounted item is not cheaper.");
  		
  		//one item at $9.90.	
  		Sale regularPrice = new Sale("cup holder", 9.90);
  		
  		//set DiscountSale specialPrice equal to DiscountSale
  		DiscountSale specialPrice = new DiscountSale("cup holder", 11.00, 10);
  		
  		//display message
  		System.out.println(regularPrice);
  		
  		//display message
  		System.out.println(specialPrice);
  		
  		//if statement
  		if (specialPrice.equalDeals(regularPrice))
  			//display message
  			System.out.println("Deals are equal.");
  		
  		//else statement
  		else
  		
  			//display message
  			System.out.println("Deals are not equal.");
  	} //end of main method
  	
  } //end of class