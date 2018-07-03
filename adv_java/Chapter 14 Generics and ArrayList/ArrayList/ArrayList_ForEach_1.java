// This program demonstrates how to use a for-each loop
// with an ArrayList
import java.util.ArrayList;

public class ArrayList_ForEach_1
{
    public static void main(String[] args)
    {
        //create a list to hold String objects      
        ArrayList <String> list = new ArrayList();

        //add three Strings to the ArrayList
        list.add("Nuts");
        list.add("Bolts");
        list.add("Washers");
        
        System.out.println("With a for loop:");        
        for (int index = 0; index < list.size(); index ++)
        {
        	System.out.println("list " + index + ": " + list.get(index));
        }
        
        
        System.out.println();
        System.out.println("With a forEach loop:");  
        
        //...can be easily translated into a forEach statement with no
        //indexing        
        for (String element: list)
        {
	        System.out.println(element);	        
	    }
	    
	    
	    System.out.println();
        System.out.println("With a forEach loop with indexing:"); 
                       	      
        //... or with indexing
        int index = 0;
        for (String element: list)
        {
	        System.out.println("element " + index + ": is " + element);
	        index ++;
	    }    
    }
}
