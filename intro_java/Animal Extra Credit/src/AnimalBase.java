/*Programmer: Broderick Higby
 * Program: AnimalBase
 * Date: 7 May 2015
 * Description: This is the base class and it lists all the possible features either true or false, then runs through the 
 * possible traits of the animals, returning the values to later be called by the AnimalMenu and Animal1Program class
*/


public abstract class AnimalBase //Start of abstract class which allows it to be extended and uses abstract methods
{

	private String animalName; //Declared private, because it's only used within the class 

	private int numberOfLegs; //Same with this and the next one

	private String Home;

	
	//Variables declared; They are static because they don't need to change values at all, just be called
	static int legs; 

	static String name;

	static String Environment;

	
	
	public AnimalBase(String name) 
	//This overriding class calls the animal name and changes previously declared animalName to name 

	{

		animalName = name;

	}

	

	public AnimalBase(String name, int legs, String Environment)
	//Uses 'this.' to make it known that the variables being called are within the AnimalBase class, because it's overloaded 

	{

		this.name = name; 

		this.legs = legs;

		this.Environment = Environment; 
		//Takes specific instances of variables and uses assignment operator to check the equality of both variables 

	}

	

	public static String getName() //accesses and returns variable to be called later 

	{

		return name;

	}

	

	public static int getLegs() //accesses and returns variable to be called later 

	{

		return legs;

	}

	

	public boolean isAMammal() //accesses and returns variable to be called later 

	{

		return true;

	}

	

	public boolean notAMammal() //accesses and returns variable to be called later 

	{

		return false;

	} 

	

	public boolean isCarnivorous() //accesses and returns variable to be called later 

	{

		return true;

	}

	
	//accesses and returns variable to be overridden and called within the specific Animal classes 
	public abstract String getHello(); 
	

	public static String getBiome() //accesses and returns variable to be called later 

	{

		return Environment;

	}

	

	public boolean GoodPet() //accesses and returns variable to be called later 

	{

		return true;

	}

	

	public boolean BadPet() //accesses and returns variable to be called later 

	{

		return false;

	}

} //End of class