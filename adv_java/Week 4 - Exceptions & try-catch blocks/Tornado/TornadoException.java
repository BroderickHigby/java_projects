 public class TornadoException extends Exception 
 {
 	
 	public TornadoException()
 	{
 		super("Tornado: Take cover immediately!");
 	}
 	
 	public TornadoException(int m)
 	{
 		super("Tornado: " + m + " miles away and approaching fast!");
 		
 	}
 	
 
 }