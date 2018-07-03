/*------------------------------------------------------------
 *Program: StaticmethodsDemo.java
 *Programmer: Jesse Leon
 *Date: 4/28/15
 *Description:
 *------------------------------------------------------------*/
 
 /**
  *Demonstrates that static methods use static binding.
  */
  
  //public class name
  public class StaticMethodsDemo
  {
  	//main method
  	public static void main(String[] args)
  	{
  		//static binding
  		Sale.announcement();
  		
  		//static binding
  		DiscountSale.announcement();
  		
  		//displays message
  		System.out.println("That showed that you can override a static method "
  							+ " definition.");
  			
  			//set Sale s equal to Sale()
  			Sale s = new Sale();
  			
  			//set DiscountSale discount equal to DiscountSale()
  			DiscountSale discount = new DiscountSale();
  			
  			//static binding
  			s.announcement();
  			
  			//static binding
  			discount.announcement();
  			
  			//displays message
  			System.out.println("No surprises so far, but wait.");
  			
  			//set Sale discount2 equal to discount
  			Sale discount2 = discount;
  			
  			//displays message
  			System.out.println("discount2 is a DiscountSale Object in a sale variable.");
  			
  			//displays message
  			System.out.println("Which definition of announcement() will " + "it use?");
  			
  			//static binding
  			discount2.announcement();
  			
  			//display message
  			System.out.println("It used the Sale version of announcement()!");
  	} //end of main method
  } //end of class