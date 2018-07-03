/* Description: This is the base class program, the other programs 
 * 
 */
public class Figure 
{
	String drawString;
	String eraseString;
	
	//This center method is called in the demo class
	public void center() 
	{
		draw();
		erase();
		System.out.println("This is the center method being called");
	}
	//A cool guitar
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
	public void erase()
	{
		for(int i = 0; i < 50; i++)
		{
			System.out.println("\n");
		}
	}
}

