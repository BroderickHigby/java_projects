/* Programmer: Broderick Higby
 * Program: SelectionSortDemo.java
 * Date: 12 April 2015
 * Description: This is a sorting array, it's pretty cool it takes the first value and compares it to the rest of the values
 * until it finds a lower value, then moves to the next value and compares it 
 */

public class SelectionSortDemo //Start of class
{
    public static void main(String[] args) //Start of main method 
    {
    	/*This is a sorting array, it's pretty cool it takes the first value and compares it to the rest of the values
    	 * until it finds a lower value, then moves to the next value and compares it 
    	 */
        double[] b = {7.7, 5.5, 11, 3, 16, 4.4, 20, 14, 13, 42}; //So here are all the values declared in the array 'b'

        System.out.println("Array contents before sorting:"); 
        int i; //Index declared 
        for (i = 0; i < b.length; i++) //index = 0; i less than the length of array 'b'; increments value +1
            System.out.print(b[i] + " "); //prints the indices of array 'b'
        System.out.println( );
            
        SelectionSort.sort(b, b.length); //Calls the sort method from the SelectionSort class

        System.out.println("Sorted array values:"); 
        for (i = 0; i < b.length; i++) //And here all the array values sorted 
            System.out.print(b[i] + " "); //Prints the array from b, but now it's sorted! :)
        System.out.println( ); //printed 
    }
}