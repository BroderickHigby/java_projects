 /* Course CS112    Days & Time: September 10, 2015
 * Chapter Number: 8 Project Number: 6
 * Programmer: Broderick Higby 
 * Program Title: Figure
 * Program Description: This program asks the user what type of shape they want to see
 * then takes their input and outputs a shape. The objective was to use late-binding and
 * polymorphism while designing the program. This is the base class,
 *  it calls all the other classes and outputs to the Demo class.
 */
public class Figure 
{

	//This center method is called in the demo class
	public void center() 
	{
		draw();
		erase();
		System.out.println("This is the center method being called");
	}
	//A cool guitar that is called from the demo class
	public void draw()
	{
		System.out.println("                   _,., ");
		System.out.println("                 ,'   ,'");
		System.out.println("                /   ,'");
		System.out.println("               /   , ");
		System.out.println("              /   ,");
		System.out.println("             /   '");
		System.out.println("            /   ,'");
		System.out.println("            '.__|");
		System.out.println("             |  |");
		System.out.println("             |__|");
		System.out.println("             |  |");
		System.out.println("             |__|");
		System.out.println("             |  |");
		System.out.println("             |__|");
		System.out.println("             |  |");
		System.out.println("             |__|");
		System.out.println("             |, |");
		System.out.println("             |--|");
		System.out.println("             |__|");
		System.out.println("             |  |");
		System.out.println("             |--|");
		System.out.println("             |__|");
		System.out.println("             |__|        ,-.");
		System.out.println("             |__|'     ,'  /");
		System.out.println("        _,.-'     ',_,' o /");
		System.out.println("       /     8888        /");
		System.out.println("       |                /");
		System.out.println("        1              /");
		System.out.println("        `L   8888     /");
		System.out.println("         |           /");
		System.out.println("        /    ====   \\");
		System.out.println("       /     ____    \\");
		System.out.println("      /     (____)  o \\");
		System.out.println("     /             o   \\");
		System.out.println("    /             o     ,'");
		System.out.println("   /               _,.'^");
		System.out.println("  /        __,.--~^");
		System.out.println(" ',,..--~~^ ");


	
	}
	public void erase() //Spaces out the menu when selected
	{
		for(int i = 0; i < 50; i++)
		{
			System.out.println("\n");
		}
	}
}

