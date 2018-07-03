/*------------------------------------------------------------
 *Program: DiscountSale.java
 *Programmer: Jesse Leon
 *Date: 4/28/15
 *Description: This base class DiscountSale file extends to 
 *the sale class file we are creating more methods to use in 
 *another file with a main method. 
 *------------------------------------------------------------*/
 
 /**
  *Class for a sale of one item with discount expressed
  *as a percent of the price, but no other adjustments.
  *Class invariant: The price is always nonnegative; the name
  *is a nonempty string; the discountis always nonnegative.
  */
  
  //public class name extends to Sale
  public class DiscountSale extends Sale
  {
  	//a percent of the price, cannot be negative
  	private double discount;
  	
  	//public method statement DiscountSale()
  	public DiscountSale()
  	{	
  		//set super constructor
  		super();
  		//set discount equal to zero
  		discount = 0;
  		
  	} //end of public method statement
  
  /**
   *Precondition: theName is a nonempty string; thePrice is nonnegative;
   *theDiscount is expressed as a percent of the price and is nonnegative.
   */
   
   //public method statement DiscountSale
   public DiscountSale(String theName, double thePrice, double theDiscount)
   {
   	//set super constructor to theName, thePrice
   	super (theName, thePrice);
   	
   	//set discount to theDiscount
   	setDiscount (theDiscount);
   	
   } //end of public method statement
   
   //public method statement DiscountSale
   public DiscountSale(DiscountSale originalObject)
   {
   	//set super constructor to originalObject
   	super (originalObject);
   	
   	//set discount equal to originalObject.discount
   	discount = originalObject.discount;
   	
   } //end of public method statement
   
   //public method statement announcement()
   public static void announcement()
   {
   	//displays message
   	System.out.println("This is the DiscountSale class.");
   	
   } //end of public method statement
   
   //public method statement bill()
   public double bill()
   {
   	//calculates fraction equation
   	double fraction = discount/100;
   	
   	//returns the equation for (1 - fraction) *getPrice()
   	return (1 - fraction) *getPrice();
   	
   } //end of public method statement
   
   //public method statement getDiscount()
   public double getDiscount()
   {
   	//return statement
   	return discount;
   	
   } //end of public method statement
   
   /**
    *Precondition: Discount is nonnegative.
    */
    
    //public method statement setDiscount
    public void setDiscount (double newDiscount)
    {
    	//if statement
    	if (newDiscount >= 0)
    		//set discount equal to newDiscount
    		discount = newDiscount;
    	
    	//else statement
    	else
    	{
    		//display error message
    		System.out.println("Error: Negative discount.");
    		
    		//exit statement
    		System.exit(0);
    	} //end else statement
    	
    } //ene of public method statement
    
    //public method statement
    public String toString()
    {
    	//return statement
    	return (getName() + " Price = $" + getPrice() + " Discount = " + discount +
    	"%\n" + " Total cose = $" + bill());
    } //end of public method statement
    
    //public boolean method statement
    public boolean equalDeals (Object otherObject)
    {
    	//if statement
    	if (otherObject == null)
    		//return statement
    		return false;
    	
    	//else if statement
    	else if (getClass() != otherObject.getClass())
    		//return statement
    		return false;
    	//else statement	
    	else
    	{
    		//set DiscountSale otherDiscountSale equal to (DiscountSale) otherObject
    		DiscountSale otherDiscountSale = (DiscountSale) otherObject;
    		
    		//return statement
    		return (super.equalDeals (otherDiscountSale) && discount == otherDiscountSale.discount);
    	} //end else statement
    } //end of public boolean method statement
} //end of base class
   