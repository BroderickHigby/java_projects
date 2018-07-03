/* Description: This is the demo class for the Figure program, it uses late binding to call the methods from Figure,
 * Triangle, and Rectangle classes to override the Figure method
 */
import java.util.Scanner;
public class FigureDemo 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //Takes user input 
		Figure userInput; //userInput is the objecct that is later called 
		int input;
		//Using a do-while loop enables selection of a figure.
		do 
		{
			System.out.println("Welcome to the cool drawing app");
			System.out.println("Please pick what you'd like to be drawn");
			System.out.println("Press '1' to draw a Triangle");
			System.out.println("Press '2' to draw a Rectangle");
			System.out.println("Press '3' to draw a surprise figure");
			
			//Takes user input and calls the corresponing class
			input = keyboard.nextInt(); 
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
			}//Ask the user about if 
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
