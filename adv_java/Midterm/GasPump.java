import java.text.DecimalFormat;
import java.util.Scanner;

public class GasPump
{
    private int creditCardNumber = 0;
    private static int transactionNumber = 0;
    final double PRICE_PER_GALLON = 2.75;
    int gasPumped = 0;
    
    public void takeCreditCard(int cardNum)
    {
        creditCardNumber = cardNum;
        transactionNumber++;
    }
    
    public int getCreditCardNumber()
    {
        return creditCardNumber;
    }
    
    public int getTransactionNumber()
    {
        return transactionNumber;
    }
    
    public String getFinalCostOutput()
    {
        DecimalFormat formatter = new DecimalFormat("$##.##");        
        return formatter.format(PRICE_PER_GALLON * gasPumped);
    }
    
    public double getFinalCostValue()
    {
        return (PRICE_PER_GALLON * gasPumped);
    }
    
    public double getPricePerGallon()
    {
        return PRICE_PER_GALLON;
    }
    
    public void pumpGas()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean finished = false;
        System.out.println("Press 'P' to start and continue pumping.");
        System.out.println("Press 'S' to stop pumping.");
        while(finished!=true)
        {
            String userInput = keyboard.next();
            if(userInput.equalsIgnoreCase("p"))
            {
                gasPumped++;
                System.out.println(getGasPumped());
            }
            else if(userInput.equalsIgnoreCase("s"))
            {
                System.out.println("Finished Pumping.");
                finished = true;
            }
        }                
    }
    
    public int getGasPumped()
    {
        return gasPumped;
    }
}
