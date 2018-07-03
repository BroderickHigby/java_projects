/* Programmer: Broderick Higby
 * Program: EnumDemo.java
 * Date: 12 April 2015
 * Description: This program uses the enum type and demonstrates enum values and how they can be used, it's like a constant and 
 * is declared sort of like an array
 */
public class EnumDemo //Start of class
{	//This is an enumerated type, it declares these values in 'WorkDay' and then declares the weekdays as constants
	//of the enumerated type 
    enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}; 

    public static void main(String[] args) //Start of main method
    {
        WorkDay startDay = WorkDay.MONDAY; //Enumerated type can be called; startDay value is constructed and MONDAY is called
        WorkDay endDay = WorkDay.FRIDAY; //endDay is constructed, it uses the variable FRIDAY from WorkDay as a constant

        System.out.println("Work starts on " + startDay); //Prints startDay variable
        System.out.println("Work ends on " + endDay); //Prints endDay variable
    } //end of main method
} //End of class
