// This class demonstrates using a bound type in a method to determine
// the smallest value in an array using the compareTo() methods.

public class BoundedMinDemo
{
	public static void main(String[] args)	
	{	
	    Integer two = 5;
	    String[] cities = {"Kahului", "Makena", "Paia", "Kehei", "Hana"};
	    String[] strings = {"Paris", "London", "New York", "Rome"};
	    Integer[] nums ={ 45, 14, 8, 21, two };
	
	    String smallOne = BoundedMinDemo.<String>min(cities);
	    System.out.println("Smallest city in cities array? " + smallOne);
	    System.out.println();
	
	    String smallTwo = BoundedMinDemo.<String>min(strings);
	    System.out.println("Smallest city in strings array? " + smallTwo);
	    System.out.println();
	
	    Integer smallThree = BoundedMinDemo.<Integer>min(nums);
	    System.out.println("Smallest Integer in nums array? " + smallThree);
	    System.out.println();
	}    


    public static <E extends Comparable> E min(E[] a)
    {
	    E smallest = a[0];
	
	    for (int i = 1; i < a.length; i++)
	    {
	        if (a[i].compareTo(smallest) < 0) smallest = a[i];		
	    }
	    return smallest;
    }
}    