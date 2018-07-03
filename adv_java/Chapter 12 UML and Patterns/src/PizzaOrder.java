import java.util.Scanner;

public class PizzaOrder
{
	private final int SMALLPIZZA = 8;
	private final int MEDIUMPIZZA = 10;
	private final int LARGEPIZZA = 12;
	private final int MAXPIZZAS = 10;
	private int numPizzas = 0;
	
	private Pizza[] p = new Pizza[MAXPIZZAS];
	
	public void addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushrooms)
	{
		Pizza pizzaCons = new Pizza(size, pepperoni, sausage, mushrooms);
		p[numPizzas] = pizzaCons;
		numPizzas++;
	}
	public double calcCost()
	{
		double totalCost = 0;
		
		for(int i = 0 ; i < p.length; i++)
		{
			if (p[i] == null)
			{
			break;	
			}
			char size = p[i].getSize();
			if(size == 's' || size == 'S')
			{
				totalCost += SMALLPIZZA;
			}
			if(size == 'm' || size == 'M')
			{
				totalCost += MEDIUMPIZZA;
			}
			if(size == 'l' || size == 'L')
			{
				totalCost += LARGEPIZZA;
			}
			totalCost += p[i].getNumToppings();
		}
		return totalCost;
	}
	public void pizzaMenu()
	{
		
		System.out.println("A small pizza would cost: " + SMALLPIZZA);
		System.out.println("A medium pizza would cost: " + MEDIUMPIZZA);
		System.out.println("A large pizza would cost: " + LARGEPIZZA);
		System.out.println("Each additional topping: Pepperoni, Sausage, and Mushrooms is $1 per topping\n");
	}
	public void customPizza()
	{
		boolean orderCount = true;		
		Scanner keyboard = new Scanner(System.in);
		do
		{
			System.out.println("Please enter 's', 'm', 'l' for the size of the pizza");
			char pSize = keyboard.next().charAt(0);

			System.out.println("Do you want pepperoni on it?");
			boolean pPep = keyboard.nextBoolean();
			
			System.out.println("Do you want sausage on it?");
			boolean pSau = keyboard.nextBoolean();
			
			System.out.println("Do you want mushrooms on it?");
			boolean pMush = keyboard.nextBoolean();
			
			//Takes the pizza size,pep, mush, and saus values from the Pizza class
			Pizza myPizza = new Pizza(pSize, pPep, pSau, pMush);
			
			
			addPizzaToOrder(myPizza.getSize(), myPizza.getPepperoni(),myPizza.getSausage(),myPizza.getMushrooms());
			
			//Order again?
			System.out.println("Would you like to order another pizza?");
			orderCount =keyboard.nextBoolean();
				if(false)
				{
					orderCount = false;
				}
			}while(orderCount);
		
		System.out.println("Your total cost");
		System.out.println(calcCost());
	}
}
