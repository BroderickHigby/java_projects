/*Programmer: Broderick Higby
 * Program: Dog1
 * Date: 7 May 2015
 * Description: This is the demo class for all the Animal classes and prompts users for options on which animal
 * they want to know about. It gives specific info for the AnimalMenu and Animal1Program classes to use working w/ AnimalBase
 */

public class Dog1 extends AnimalBase
//This is the awesome dog class that extends the AnimalBase and is called by AnimalMenu and Animal1Program


{

	public  Dog1(String name, int legs, String Environment) //This holds the information for the dog species 

	{

		super(name, legs, Environment); //This super class passes through name, legs, and environment

	}

		
	//getHello returns the animal sound, this is the only real specific thing that can't be identified within the base class
	public String getHello()

	{

		return "Woof"; //Returns the dog sound

	}

	

}