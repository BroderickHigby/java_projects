import java.util.*;
import java.text.*;
import java.io.*;

public class GasPumpDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("$##.##");
        
        System.out.println("Welcome to your Local Sally's Gas Station");
        ArrayList<GasPumpCustomer> customerList = new ArrayList<>();
        boolean pumpOn = true;
        GasPump station;
        ArrayList<GasPumpCustomer> tempList = null;
        
        while(pumpOn)
        {
            station = new GasPump();
            System.out.println("Please enter your Credit Card Number");
            int userCreditCard = keyboard.nextInt();
            station.takeCreditCard(userCreditCard);
            station.pumpGas();
            System.out.println("You pumped " + station.getGasPumped() + " gallons of gas");
            System.out.println("You have a total of " + station.getFinalCostOutput());
            customerList.add(new GasPumpCustomer(station.getTransactionNumber(), station.getCreditCardNumber(),
            station.getPricePerGallon(), station.getGasPumped(), station.getFinalCostValue()));
            System.out.println("Would you like to turn off pump or move on to another customer?");
            System.out.println("Yes (turn off pump) or No (keep pumping)?");
            String userInput = keyboard.next();
            if(userInput.equalsIgnoreCase("yes"))
            {
                try
                {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("customerData.dat"));
                    outputStream.writeObject(customerList);
                    System.out.println("Data for today's customers saved.");
                    outputStream.close();
                    pumpOn = false;
                }
                catch(IOException e)
                {
                    System.out.println("Problem with file output");
                    System.exit(0);
                }                
            }
            else if(userInput.equalsIgnoreCase("no"))
            {
                station = null;
            }
        }
        
        System.out.println("Getting customer information for today ...");
        try
        {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("customerData.dat"));
            tempList = (ArrayList<GasPumpCustomer>)inputStream.readObject();
            inputStream.close();
        }        
        catch(ClassNotFoundException e)
        {
            
        }
        catch(FileNotFoundException e)
        {
            
        }
        catch(IOException e)
        {
            
        }        
        
        for(int i = 0; i < tempList.size(); i++)
        {
            System.out.println("Customer transaction #:" + tempList.get(i).getTransactionNumber() + 
                    " Credit Card: " + tempList.get(i).getCreditCardNumber());
            System.out.println("Gas Pumped: " + tempList.get(i).getGallonsPurchased());
            System.out.println("Amount Paid: " + formatter.format(tempList.get(i).getTotalCost()));
            System.out.println();
        }
    }
} 