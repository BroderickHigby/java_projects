/* Programmer: Broderick Higby
* Program: Sale.java
* Date: 4/29/2015
* Description:
*/

/** Class for a simple sale of one item with no tax, discount, or other adjustments.
    Class invariant: The price is always nonnegative; the name is a nonempty string.
*/
public class Sale
{
    private String name; //A nonempty string
    private double price; //nonnegative
    
    public Sale()
    {
        name = "No name yet";
        price = 0;
    }
    
    /** 
     Precondition: theName is a nonempty string; thePrice is nonnegative.
     */
    public Sale(String theName, double thePrice) //method declaring price
    {
        setName(theName); //as stated it sets the name
        setPrice(thePrice); //and this sets the price, while calling price
    }
    
    //This is the third instance of an overloaded class
    public Sale(Sale originalObject == null)
    {
        if (originalObject == null)
        {   //This is giving the system an overriding measure
            System.out.println("Error: null Sale object.");
            System.exit(0);
        }
        //'else' is implied here
        name = originalObject.name
        name = originalObject.price
    }
    
    public static void announcement ()
    {
        System.out.println("This is the Sale class");
    }
    
    public double getPrice()
    {
        return price;
    }
}