// This program demonstrates how to use a for-each loop
// with a Generic ArrayList where the object's type is specified
import java.util.ArrayList;

public class GenericArrayList_ForEach_2
{
    public static void main(String[] args)
    {
        //create a list to hold Inventory objects      
        ArrayList <Inventory> list = new ArrayList<Inventory>();

        //add three Items to the ArrayList
        list.add(new Inventory("Nuts", 100));
        list.add(new Inventory("Bolts", 150));
        list.add(new Inventory("Washers", 75));
        
        System.out.println("With a for loop:");        
        for (int index = 0; index < list.size(); index ++)
        {
        	Inventory item = list.get(index);
        	System.out.println("Item at index " + index + "\nDescription:"
        	+ item.getDescription() + "\nUnits: " + item.getUnits());
        }
        
        
        System.out.println();
        System.out.println("With a forEach loop:");  
        
        //...can be easily translated into a forEach statement with no
        //indexing        
        for (Inventory item: list)
        {
	        System.out.println("Description: " + item.getDescription() +
	                           "\nUnits: " +item.getUnits());	        
	    }
	    
	    
	    System.out.println();
	 }
}	    