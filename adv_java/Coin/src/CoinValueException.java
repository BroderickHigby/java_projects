@SuppressWarnings("serial")
public class CoinValueException extends Exception
{
	
	
	public CoinValueException()
	{
		super("Invalid coin value, please try again. Qualifying values .01, .05"
		+".10 etc");
		
	}
	public CoinValueException(String message )
	{
		super(message);
	}
}