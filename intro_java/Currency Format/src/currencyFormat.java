import java.text.NumberFormat;
import java.text.Locale;

public class currencyFormat 
{
	public static void main(String[] args)
	{
			System.out.println("Without formatting:");
			//numbers output are rounded 
			System.out.println(19.8);
			System.out.println(19.81111);
			System.out.println(19.89999);
			System.out.println(19);
			System.out.println();
			
			System.out.println("Default location:");
			NumberFormat moneyFormatter =
					//outputs currency instance
							NumberFormat.getCurrencyInstance();
			
			System.out.println(moneyFormatter.format(19.8));
			System.out.println(moneyFormatter.format(19.81111));
			System.out.println(moneyFormatter.format(19.89999));
			System.out.println(moneyFormatter.format(19));
			System.out.println();
			
			System.out.println("US as location:");
			NumberFormat moneyFormatter2 =
							NumberFormat.getCurrencyInstance(Locale.US);
			
			System.out.println(moneyFormatter2.format(19.8));
			System.out.println(moneyFormatter2.format(19.81111));
			System.out.println(moneyFormatter2.format(19.89999));
			System.out.println(moneyFormatter2.format(19));


	}
	
	
	
}
