

/** Chapter No. 13 - Exercise No.  8 
   File Name:          CloneTest.java
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
public class CloneTest 
{
	public static void main(String[] args)
	{
		Person pers = new Person("Broderick Higby");
		pers.setBorn("August", 12, 1991 );
		pers.setDead("August", 12, 3005 );
		System.out.println(pers.getName());		
		System.out.println(pers.getBirthDate());
		System.out.println(pers.getDeathDate());
	}
}