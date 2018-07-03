/*Programmer: Broderick Higby
 * Program: Frog1
 * Date: 7 May 2015
 * Description: This frog class gives specific info for the AnimalMenu and Animal1Program classes to use working w/ AnimalBase
 */
public class Frog1 extends AnimalBase
//This is the awesome Frog class that extends the AnimalBase and is called by AnimalMenu and Animal1Program

{
	public Frog1(String name, int legs, String Environment) //This holds the information for the cat species 
	{
		super(name, legs, Environment); //This super class passes through name, legs, and environment
	}

	//getHello returns the animal sound, this is the only real specific thing that can't be identified within the base class
	public String getHello()
	{
		return "Ribbit"; //Returns the frog sound

	}
	
	
}