import java.util.Scanner;

/* Description: This is the demo class for the Figure program, it uses late binding to call the center method from Figure
 * 			and the Triangle and Rectangle classes override the Figure method
 */
public class FigureDemo 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //Takes user input 
		Figure userInput;
		int input;
		
		do
		{
			System.out.println("Welcome to the cool drawing app");
			System.out.println("Please pick what you'd like to be drawn");
			System.out.println("Press '1' to draw a Triangle");
			System.out.println("Press '2' to draw a Rectangle");
			System.out.println("Press '3' to draw a surprise figure");
			
			
			input = keyboard.nextInt(); //input 
			if (input == 1)
			{
				userInput = new Triangle();
				userInput.draw();
			} 	
			else if(input == 2)
			{
				userInput = new Rectangle();
				userInput.draw();
			}
			else if(input == 3)
			{
				userInput = new Figure();
				userInput.draw();
			}
			System.out.println("Press '1' to erase \nOr 4 to reset");
			input = keyboard.nextInt();
			if (input == 1)
			{
				userInput = new Figure();
				userInput.erase();
			} 				
			if ((input < -1) || (input < 3))
			{
				System.out.println("Please make a valid selection");
			}
		}while(input != -1);
				
		
			
			
			
		

	}
}
