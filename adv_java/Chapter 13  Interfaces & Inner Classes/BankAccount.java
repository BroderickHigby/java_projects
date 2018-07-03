public class BankAccount implements Account
{
	private double balance;
	private int deposCount;
	private int withCount;
	private double annualRate;
	private double surcharge;
	private Interest interest;
	
	
	public BankAccount(double newBal, double newRate)
	{
		balance = newBal;
		annualRate = newRate;
		interest = new Interest();
		inerest.calcInterest();
	}
	
	public void deposit(double depos)
	{
		balance = balance + depos;
		deposCount ++;
	}
	
	public double withdrawal(double with)
	{
		balance = balance - with;
		withCount ++;
	}
	
	public void monthlyProcess()
	{
		balance = balance - surcharge;
		calcInterest();
		
	}

	public double getBalance()
	{
		return balance;	
	}
	
	public void setRate(double newRate)
	{
		annualRate = newRate;	
	}
	
	public double getAnnualRate()
	{
		return annualRate;	
	}
	
	public void setSurCharge(double newSur)
	{
		surcharge = newSur;	
	}
	
	public double getSurCharge()
	{
		return surcharge;	
	}
	private class Interest
	{
		double monthlyInterestRate;
		double monthlyInterest;
		
		public void calcInterest()
		{
			monthlyInterestRate = annualRate/12;
			monthlyInterest = balance * monthlyInterestRate;
		}
	}
}