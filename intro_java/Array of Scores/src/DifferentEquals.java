/* Programmer: Broderick Higby
 * Program: DifferentEquals.java
 * Date: 3 April 2015
 * Description: Shows the difference between == and equalsMethod and to show the equalArray method
 */
public class DifferentEquals //Start of class
{
    /**
     A demonstration to see how == and an equalArrays method are different.
    */
    public static void main(String[] args) 
    {
        int[] c = new int[10]; //c is declared as an array value 10
        int[] d = new int[10]; //same here for d

        int i; //i is declared as a variable
        for (i = 0; i < c.length; i++) //i is a variable declared to be smaller than c; adding 1 to i variable for each loop
            c[i] = i; //The input of 'c' array is equal to 'i' 

        for (i = 0; i < d.length; i++) //i is equal to 0, i is smaller than the length of d, add 1 to 'i'
            d[i] = i; //The input of 'd' array is equal to 'i'
        //Important to get the signs correct '=' just copies a memory address to another, and '==' compares memory addresses 
        if (c == d) //So this compares memory locations
            System.out.println("c and d are equal by ==."); //not equal b/c declared in different locations
        else
            System.out.println("c and d are not equal by ==."); //outputs not equal
 
        System.out.println("== only tests memory addresses."); //Recapitulation of what I said earlier, shown as output

        //This would be the better method to use for comparing arrays to see if they contain the same elements 
        if (equalArrays(c, d))
            System.out.println(
                   "c and d are equal by the equalArrays method.");
        else
            System.out.println(
                  "c and d are not equal by the equalArrays method.");

        System.out.println(
                "An equalArrays method is usually a more useful test.");//Thank you program for your output

    }
   //And here's the equalsArrays method, which tests two arrays to see if they have the same elements   
   public static boolean equalArrays(int[] a, int[] b)
   { 
       if (a.length != b.length) //execute if the # of indices in the 'a' array isn't equal to the amount in the 'b' array  
           return false; //returns false to boolean variable 
       else
       {
           int i = 0; 
           while (i < a.length) //i(0) is greater than the length of indices in the 'a' array  
           {
               if (a[i] != b[i])//if they're not equal then execute this  
                   return false; //return false to boolean variable 
               i++; //repeat while loop adding 1 
           }
       }
 
       return true; //return true for equalArrays
    }
 
}
