/*Programmer: Broderick Higby
 * Program: Duck1
 * Date: 7 May 2015
 * Description: This duck class gives specific info for the AnimalMenu and Animal1Program classes to use working w/ AnimalBase
 */
public class Duck1 extends AnimalBase
//This is the awesome cat class that extends the AnimalBase and is called by AnimalMenu and Animal1Program


{

	public Duck1(String name, int legs, String Environment) //This holds the information for the cat species

	{

		super(name, legs, Environment); //This super class passes through name, legs, and environment

	}

	
	//Since both of these are false for the duck, it will pull these methods 
	public boolean isAMammal()

	{

		return false;

	} 

		
	//False as well
	public boolean isCarnivorous()

	{

		return false;

	}

	
	//getHello returns the animal sound, this is the only real specific thing that can't be identified within the base class
	public String getHello()

	{

		return "Quack"; //Returns the ducks sound

	}

	

}