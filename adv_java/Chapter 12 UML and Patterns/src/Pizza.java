public class Pizza 
{
	private boolean pepperoni;
	private boolean sausage;
	private boolean mushrooms;
	private char size;
	
	public Pizza(char pizzaSize, boolean pepBool, boolean sausBool, boolean mushBool)
	{
		size = pizzaSize;
		pepperoni = pepBool;
		mushrooms = mushBool;
		sausage = sausBool;
	}
	public char getSize()
	{
		return size;
	}
	public int getNumToppings()
	{
		int numToppings = 0;
		if (pepperoni)
		{
			numToppings++;
		}
		if (sausage)
		{
			numToppings++;
		}
		if (mushrooms)
		{
			numToppings++;
		}
		return numToppings;
	}
	
	public boolean getPepperoni()
	{
		return pepperoni;
	}
	
	public boolean getSausage()
	{
		return sausage;
	}
	
	public boolean getMushrooms()
	{
		return mushrooms;
	}
	
	
}
