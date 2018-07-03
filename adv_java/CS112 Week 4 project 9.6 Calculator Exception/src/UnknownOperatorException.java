 
//This extends the calculator, and controls the exceptions
public class UnknownOperatorException extends Exception 
{
	public UnknownOperatorException() 
	{
    super("Please select an actual operator and try again: ");
	}

	public UnknownOperatorException(String message)
	{
    super(message);
	}
}