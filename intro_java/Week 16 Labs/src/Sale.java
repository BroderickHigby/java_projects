/*------------------------------------------------------------
 *Program: Sale.java
 *Programmer: Jesse Leon
 *Date: 4/28/15
 *Description: For this program we are creating a base class
 *that will instantiate several methods that will be used in 
 *additional classes that we will be creating in the other
 *assigned displays.
 *------------------------------------------------------------*/
 
 /**
  *Class for a simple sale of one item with no tax, discount, or 
  *other adjustments. 
  *Class invariant: he prices is alwas nonnegative; the name is a 
  *nonempty String.
  */
  
  //public class name
  public class Sale
  {
  	//a nonempty string
  	//declaring variable
  	private String name;
  	
  	//nonnegative
  	//declaring variable
  	private double price;
  	
  	//public method statement Sale()
  	public Sale()
  	{
  		//setting equal to " "
  		name = "No name yet";
  		
  		//setting price equal to zero
  		price = 0;
  		
  	} //end of public method statement
  	
  	/**
  	 *Precondition: theName is a nonempty string; thePrice is nonnegative.
  	 */
  	 
  	//public method statement Sale(String theName, double thePrice)
  	public Sale(String theName, double thePrice)
  	{
  		//set Name to theName
  		setName(theName);
  		
  		//setPrice to thePrice
  		setPrice(thePrice);
  		
  	} //end of public method statement
  	
  	//public method statement Sale(Sale originalObject)
  	public Sale(Sale originalObject)
  	{
  		//if statement 
  		if (originalObject == null)
  		{
  			//displays error message
  			System.out.println("Error: null Sale object.");
  			
  			//exit statement
  			System.exit(0);
  		} //endif statement
  		
  		//set name equal to originalObject.name
  		name = originalObject.name;
  		
  		//set price equal to originalObject.price
  		price = originalObject.price;
  		
  	} // end of public method statement
  	
  	//public static method statement announcement()
  	public static void announcement()
  	{
  		//displays mesage
  		System.out.println("This is the Sale class.");
  		
  	} //end of public static method statement
  	
  	//public method statement getPrice()
  	public double getPrice()
  	{
  		//return statement
  		return price;
  	} // end of public method statement
  	
  	/**
  	 *Precondition: newPrice is nonnegative.
  	 */
  	 
  	 //public method statement setPrice(double newPrice)
  	 public void setPrice(double newPrice)
  	 {
  	 	//if statement
  	 	if (newPrice >= 0)
  	 		//setting price equal to newPrice
  	 		price = newPrice;
  	 	//else statement	
  	 	else
  	 	{
  	 		//displays error message
  	 		System.out.println("Error: Negative price.");
  	 		//exit statement
  	 		System.exit(0);
  	 	} //end else statement
  	 } // end of public method statement
  	 
  	 //public method statement getName()
  	 public String getName()
  	 {
  	 	//return statement
  	 	return name;
  	 	
  	 } //end of public method statement
  	 
  	 /**
  	  *Precondition: newName is a nonempty string.
  	  */
  	  
  	  //public method statement setName(String newName)
  	  public void setName(String newName)
  	  {
  	  	//if statement
  	  	if (newName != null && newName != "")
  	  		//set name = newName
  	  		name = newName;
  	  		
  	  	//else statement
  	  	else
  	  	{
  	  		//display error message
  	  		System.out.println("Error: Improper name value.");
  	  		//exit statement
  	  		System.exit(0);
  	  	} //end else statement
  	  	
  	  } //end of public method statement
  	  
  	  //public method statement String toString()
  	  public String toString()
  	  {
  	  	//return statement to display message
  	  	return (name + " Price and total cost = $" + price);
  	  	
  	  } //end of public method statement
  	  
  	  //public method statement bill()
  	  public double bill()
  	  {
  	  	//return statement
  	  	return price;
  	  	
  	  } //end of public method statement
  	  
  	  /*
  	   *Returns true if the names are the same and the bill for the calling 
  	   *object is equal to the bill for the otherSale; otherwise returns false.
  	   *Also returns false if otherObject is null.
  	   */
  	   
  	   //public boolean method statement
  	   public boolean equalDeals (Sale otherSale)
  	   {
  	   	//if statement
  	   	if (otherSale == null)
  	   		//return statement
  	   		return false;
  	   	//else statement	
  	   	else
  	   		//return statement
  	   		return (name.equals(otherSale.name) && bill() == otherSale.bill());
  	   		
  	   } //end of public boolean method statement
  	   
  	   /*
  	    *Returns true if the bill for the calling object is less than
  	    *the bill for otherSale; otherwise returns false.
  	    */
  	    
  	    //public boolean method statement
  	    public boolean lessThan (Sale otherSale)
  	    {
  	    	//if statement
  	    	if (otherSale == null)
  	    	{
  	    		//displays error message
  	    		System.out.println("Error: null Sale object.");
  	    		
  	    		//exit statment
  	    		System.exit(0);
  	    		
  	    	} // endif statement
  	    	
  	    	//return statement 
  	    	return (bill() < otherSale.bill());
  	    } //end of public boolean method statement
  	    
  	    //public boolean method statement
  	    public boolean equal(Object otherObject)
  	    {
  	    	//if statement
  	    	if (otherObject == null)
  	    		//return statement
  	    		return false;
  	    	//elseif statement
  	    	else if (getClass() != otherObject.getClass())
  	    		//return statement
  	    		return false;
  	    		
  	    	//else statement
  	    	else
  	    	{
  	    		//set Sale otherSale equal to (Sale)otherObject
  	    		Sale otherSale = (Sale)otherObject;
  	    		
  	    		//return statement
  	    		return (name.equals(otherSale.name) && (price == otherSale.price));
  	    	} //end else statement
  	    	
  	    } //end of public boolean method statement
  } //end of sale base class