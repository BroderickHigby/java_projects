import java.io.Serializable;

public class GasPumpCustomer implements Serializable
{
    private int transactionNumber;
    private int creditCardNumber;
    private double pricePerGallon;
    private int gallonsPurchased;
    private double totalCost;
    
    public GasPumpCustomer(int transactionNumber, int creditCardNumber, double pricePerGallon, int gallonsPurchased, double totalCost)
    {
        this.transactionNumber = transactionNumber;
        this.creditCardNumber = creditCardNumber;
        this.pricePerGallon = pricePerGallon;
        this.gallonsPurchased = gallonsPurchased;
        this.totalCost = totalCost;
    }
    
    public int getTransactionNumber() {
        return transactionNumber;
    }
    
    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) {
        this.pricePerGallon = pricePerGallon;
    }

    public int getGallonsPurchased() {
        return gallonsPurchased;
    }

    public void setGallonsPurchased(int gallonsPurchased) {
        this.gallonsPurchased = gallonsPurchased;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }    
    
}