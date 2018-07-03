/* Programmer: Broderick Higby
 * Program: SelectionSort.java
 * Date: 12 April 2015
 * Description: The main method will be called by the SelectionSort demo, and then it will 
 * sort the array and return the sorted array to the main method
 */
public class SelectionSort //Start of class
{
    /**
     Precondition: numberUsed <= a.length;
                  The first numberUsed indexed variables have values.
     Action: Sorts a so that a[0] <= a[1] <= ... <= a[numberUsed - 1].
    */
    public static void sort(double[] a, int numberUsed) //double type Array 'a', using integer numberUsed as parameters  
    {
        int index, indexOfNextSmallest; //Declares multiple variables of int type on same line
        
        //numberUsed-1 is the element-1 starting @ 0, then comparing indices and sorting them 
        for (index = 0; index < numberUsed - 1; index++) 
        {//Place the correct value in a[index]:
            indexOfNextSmallest = indexOfSmallest(index, a, numberUsed);
            interchange(index,indexOfNextSmallest, a);
            //a[0] <= a[1] <=...<= a[index] and these are the smallest
            //of the original array elements. The remaining positions
            //contain the rest of the original array elements.
        }
    }

    /**
     Returns the index of the smallest value among
     a[startIndex], a[startIndex+1], ... a[numberUsed - 1]
    */
    private static int indexOfSmallest(int startIndex,
                                              double[] a, int numberUsed)
    {
        double min = a[startIndex];
        int indexOfMin = startIndex;
        int index;
        for (index = startIndex + 1; index < numberUsed; index++)
            if (a[index] < min)
            {
                min = a[index];
                indexOfMin = index;
                //min is smallest of a[startIndex] through a[index]
            }
        return indexOfMin; //Returns the indexOfMin 
    }
    
    /** 
     Precondition: i and j are legal indices for the array a.
     Postcondition: Values of a[i] and a[j] have been interchanged.
    */
    //Interchange method declared; variables i & j are variables; 'a' array are all declared in parameters
    private static void interchange(int i, int j, double[] a) 
    {
        double temp; //Temp declared 
        temp = a[i]; //j index is part of 'a' array 
        a[i] = a[j]; //Equals method compares the arrays and indices inside
        a[j] = temp; //original value of a[i]; The array a[j] is stored on temp variable
    }
    
}
   