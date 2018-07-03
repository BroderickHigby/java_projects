/*Programmer: Broderick Higby
 * Program: Fox1
 * Date: 7 May 2015
 * Description: This Fox class gives specific info for the AnimalMenu and Animal1Program classes to use working w/ AnimalBase
 */
public class Fox1 extends AnimalBase
//Saving the best class for last; The classiest class. 
//The Fox class and this extends the AnimalBase and is called by AnimalMenu and Animal1Program
{

	public Fox1(String name, int legs, String Environment) //This holds the information for the fox species 

	{

		super(name, legs, Environment); //This super class passes through name, legs, and environment

	}

		
	//getHello returns the animal sound, this is the only real specific thing that can't be identified within the base class
	public String getHello()

	{
		//Returns the foxes sound; which is also the question of a song that was very popular last year
		return "Jacha-chacha-chacha-chow!"
			+ "\nJacha-chacha-chacha-chow!"
			+ "\nJacha-chacha-chacha-chow!";

	}
}