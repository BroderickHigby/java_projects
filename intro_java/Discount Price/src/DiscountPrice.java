/*Program: Discount Price
  Programmer: Broderick Higby
  Date: 2-19-15
  Description: This program will display a selection menu of various discount codes
  , in which the user will input values to be calculated to find the overall discount price.*/
  
 
  import java.util.Scanner;//Allows us to utilize the Scanner Class
  
  public class DiscountPrice//Beginning of Class
  {
   
	  public static void main(String[] args)//Beginning of method
	  {
    
		  Scanner keyboard = new Scanner (System.in);//Instantiates the Scanner Object
    
		  //Here, the variables are defined to their respective data types
		  double price;
		  double DiscountAmount, DiscountPrice;
		  char menuCode = ' ';
    
		  System.out.println("Enter the regular price for the item:$ ");
    
		  price = keyboard.nextDouble();//Scans in entered value
    
		  //A Discount Selection Menu will be displayed with options.
		  System.out.println("Discount Selection Menu:\n\n" + "Enter H for a Discount Rate of 50%\n\n" + "Enter F for a Discount Rate of 40%\n\n" + "Enter T for a Discount Rate of 33%\n\n"+
     
     		"Enter Q for a Discount Rate of 25%\n\n" + "Enter Z for a Discount Rate of 0%\n");
    
		  System.out.println("Enter the Discount Code: ");
		  menuCode = keyboard.next().charAt(0);//Scans in entered character
		  
		  //Beginning of if else block statement
		  if (menuCode == 'H'|| menuCode == 'h')
		  {
			  /*If H or h are chosen, it will multiply the entered price by .5 and calculate
			  and display the Discount Amount and Discount Price*/
			  DiscountAmount = price*.50;
			  System.out.println("The Discount Amount is:$" + DiscountAmount);
			  DiscountPrice = price - DiscountAmount;
			  System.out.println("The Discount Price is:$" + DiscountPrice);
		  }
    
		  else if (menuCode == 'F'|| menuCode == 'f')
		  {
			  /*If F or f are chosen, it will multiply the entered price by .4 and calculate
			  and display the Discount Amount and Discount Price*/
			  DiscountAmount = price*.40;
			  System.out.println("The Discount Amount is:$" + DiscountAmount);
			  DiscountPrice = price - DiscountAmount;
			  System.out.println("The Discount Price is:$" + DiscountPrice);
		  }
   
		  else if (menuCode == 'T'|| menuCode == 't')
		  {
			  /*If T or t are chosen, it will multiply the entered price by .33 and calculate
			  and display the Discount Amount and Discount Price*/
			  DiscountAmount = price*.33;
			  System.out.println("The Discount Amount is:$" + DiscountAmount);
			  DiscountPrice = price - DiscountAmount;
			  System.out.println("The Discount Price is:$" + DiscountPrice);
		  }
		  
		  else if (menuCode == 'Q'|| menuCode == 'q')
		  {
			  /*If Q or q are chosen, it will multiply the entered price by .25 and calculate
			  and display the Discount Amount and Discount Price*/
			  DiscountAmount = price*.25;
			  System.out.println("The Discount Amount is:$" + DiscountAmount);
			  DiscountPrice = price - DiscountAmount;
			  System.out.println("The Discount Price is:$" + DiscountPrice);
		  }
		  
		  else if (menuCode == 'Z'|| menuCode == 'z')
		  {
			  /*If Z or z are chosen, it will multiply the entered price by 0.0 and calculate
			  and display the Discount Amount and Discount Price*/
			  DiscountAmount = price*0.0;
			  System.out.println("The Discount Amount is:$" + DiscountAmount);
			  DiscountPrice = price - DiscountAmount;
			  System.out.println("The Discount Price is:$" + DiscountPrice);
		  }
		  
		  else
		  {
			  //If an invalid selection is chosen, this message will be displayed.
			  System.out.println("Oops, you entered an invalid selection. Please enter a valid election to continue");
		  }
   
	  }//End of method
   
  }//End of Class
