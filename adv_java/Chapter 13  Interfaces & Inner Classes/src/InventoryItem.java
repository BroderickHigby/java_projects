/** Chapter No. 13 - Exercise No.  2 
   File Name:          InventoryItem.java
   Programmer:         Broderick Higby
   Date Last Modified: November 5, 2015

 *Algorithm:
	- Create the array to hold the uniqueIDNumbers
	- Establish inventory numbers out of chronological order
	- Call sort method in SortInventory class and have it sort through the values using the comparable interface
	- Return value to InventoryItem 
	- Create an array for the names 
	- Send the values over to SortInventory.sort method
	- return the sorted array of names 
 */
public class InventoryItem
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Bro-dy's Beach-front Bro Bar");
        /***********This is the numbers array***************************/
        System.out.println("Listed below are the Inventory's Unique ID Numbers ");
        Double[] uniqueItemID = new Double[10];
        for (int i = 0; i < uniqueItemID.length; i++)
        {
            uniqueItemID[i] = new Double(uniqueItemID.length - i);
        }
        System.out.println("Before sorting:");
        int i;
        for (i = 0; i < uniqueItemID.length; i++)
        {
            System.out.print(uniqueItemID[i].doubleValue( ) + ", ");
        }
            System.out.println( );

        SortInventory.sort(uniqueItemID, uniqueItemID.length);

        System.out.println("After sorting:");
        for (i = 0; i < uniqueItemID.length; i++)
        {
            System.out.print(uniqueItemID[i].doubleValue( ) + ", ");
        }
/***********This is the name array***************************/

             System.out.println("\nListed below are the names of store items in Bro-dy's store");
           String[] a = new String[10];
            a[0] = "Bro Hats";
            a[1] = "Bro Tanks";
            a[2] = "Bro Sandals";
            int numberUsed = 3;

            System.out.println("Before sorting:");
            for (i = 0; i < numberUsed; i++)
            {
                System.out.print(a[i] + ", ");
            }
            System.out.println( );

            SortInventory.sort(a, numberUsed);

            System.out.println("After sorting:");
            for (i = 0; i < numberUsed; i++)
            {
                System.out.print(a[i] + ", ");
            }
            System.out.println( );
    }
}

