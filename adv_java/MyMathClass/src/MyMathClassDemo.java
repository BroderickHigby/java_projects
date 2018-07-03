/** Chapter No. 14 	 - Exercise No. 4
   File Name:          MyMathClassDemo.java
   Programmer:         Broderick Higby
   Date Last Modified: November 17, 2015

 *Algorithm:
  MyMathClass.java
  - Declare private variables for calculations
  - create empty constructor method
  - Create the StdDev method using a generic type T, use for loop to add avg. & arraylist
  		Then return the double value of it
  - Divide the avg. & number of list entries
  - Create another for, each loop and use Math.pow to raise the power 
  		of the arraylist - average. Put that in the StdDev object
  - Divide the StdDev by list entries to get the average, then square root that and return StdDev
  MyMathClassDemo.Java
  - Create an arraylist of type double
  - Add a bunch of numbers to the array list
  - Send to MyMathClass and print result 
  - Create an arraylist of type Integer
  - Throw more values in that arraylist 
  - Send to MyMathClass and print result 
  - Put in a String array that would generate a compile-time error *Commented out*
 */
import java.util.ArrayList;
public class MyMathClassDemo
{
	public static void main(String[] args)
	{
		double stdDev = 0;
		
		ArrayList<Double> doubArrayList = new ArrayList<Double>();
		doubArrayList.add(new Double(23.0));
		doubArrayList.add(new Double(67.1));
		doubArrayList.add(new Double(9.9));
		doubArrayList.add(new Double(346.3));
		doubArrayList.add(new Double(227.43));
		doubArrayList.add(new Double(97.67));
		doubArrayList.add(new Double(5.96));
		doubArrayList.add(new Double(39.3));
		doubArrayList.add(new Double(53.1));
		doubArrayList.add(new Double(25.0));
		
		MyMathClass<Double> myDouble = new MyMathClass<Double>();
		stdDev = myDouble.standardDeviation(doubArrayList);
		System.out.println("The standard deviation of the Double ArrayList is " + stdDev);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(new Integer(34));
		intArrayList.add(new Integer(23));
		intArrayList.add(new Integer(56));
		intArrayList.add(new Integer(94));
		intArrayList.add(new Integer(86));
		intArrayList.add(new Integer(31));
		intArrayList.add(new Integer(2));
		intArrayList.add(new Integer(97));
		intArrayList.add(new Integer(87));
		intArrayList.add(new Integer(12));
		
		MyMathClass<Integer> myInteger = new MyMathClass<Integer>();
		stdDev = myInteger.standardDeviation(intArrayList);
		System.out.println("The standard deviation of the Integer ArrayList is " + stdDev);
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add(new String("TrynaWreckMyProgram"));
		//MyMathClass<String> myString = new MyMathClass<String>(); //This should generate compile-time error
		//stdDev = myString.standardDeviation(strArrayList);
	}
}