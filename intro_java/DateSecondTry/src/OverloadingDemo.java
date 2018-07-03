/*Program: OverloadingDemo	
 *Programmer: Broderick Higby
 *Date: 3-22-2015
 *Description: Test Javas use of overloading with sending three different formats for the same date .*/


public class OverloadingDemo {
	
	public static void main(String[] args) //Start of class
	{
		//Takes the three formats overloaded from the DateSixthTry
		DateSixthTry date1 = new DateSixthTry(),
	             date2 = new DateSixthTry(),
	             date3 = new DateSixthTry();
		//Different formats
		date1.setDate(1,2,2008);
		date2.setDate("February", 2, 2008);
		date3.setDate(2008);
		
		//Outputs different formats
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}//End of method 
}
