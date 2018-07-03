import java.util.Scanner;
public class Driver
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Customer myCustomer = new Customer();
		myCustomer.setTransNumber(Test.getTransNumber());
		System.out.println(myCustomer.getTransNumber());
		myCustomer.setTransNumber(Test.getTransNumber());
		System.out.println(myCustomer.getTransNumber());
		myCustomer.setNumOfGallons(Test.setGallons(keyboard));
		System.out.println(myCustomer.getGallons());
	}
}