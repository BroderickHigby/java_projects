 /*;
 *
 * Group Project 2
 *
 * Programmers: Jonathan D Peterson, Oscar Labrador, Cedric Miller, Broderick Higby
 *
 * Algorithm
 * - Create base and full constructor
 *
 */
 
 import java.util.Scanner;
 
public class TornadoDemo
{
	public static void main(String[] hello)
	{
		int miles;
		miles = 0;
		
		Scanner input = new Scanner(System.in);
		try{
			
			System.out.print("Enter how many miles the tornado is: ");
			miles = input.nextInt();
			
			if(miles > 5)
			{
				throw new TornadoException();
			}
			else 
			{
				throw new TornadoException(miles);
			}
			
		}
		catch (TornadoException e)
		{
			System.out.println(e.getMessage());
		}
	}
}