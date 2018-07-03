//This program demonstrates how to use the toString() in the ArrayList class.
//With objects will give the address of each object.

import java.util.ArrayList;  

public class ArrayListDemo2_toString
{
    public static void main(String[] args)
    {
        //create a list to hold Inventory objects
        // don't specify the type of objects
        ArrayList list = new ArrayList();
        ArrayList IntList = new ArrayList();
        //add three Inventory objects to the ArrayList
        list.add(new Inventory("Nuts", 100));
        list.add(new Inventory("Bolts", 150));
        list.add(new Inventory("Washers", 75));
        
        IntList.add(new Integer(100));
        IntList.add(new Integer(150));
        IntList.add(new Integer(75));
        
        //Display each item        
        System.out.println(list);
        System.out.println();
        System.out.println(IntList);
        System.out.println();
    }
}
