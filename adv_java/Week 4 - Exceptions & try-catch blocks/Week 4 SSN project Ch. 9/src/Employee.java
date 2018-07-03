Public class Employee
{


Public void SetSSN (String SSN) throws SSNCharacterException, SSNLengthException
{
	if(SSN.length) != 9)
	{
	throw new SSNLengthException();
	}
	try
	{
	int social = Integer.parseInt(SSN);
	}
	catch(NumberFormatException e)
	{
		e.getmessage("No numbers allowed");

	}
		throw new SSNCharacterException("Try again");
}


	