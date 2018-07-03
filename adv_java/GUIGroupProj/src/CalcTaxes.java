import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class CalcTaxes 
{
	publc CalcTaxes()
	{
		JLabel taxableIncome = new JLabel("Taxable Income");
		
		JTextField userInput = new JTextField(21);
		userInput.setSize(40,10);
		
		JButton compute = new JButton("Compute");
		compute.addActionListener(this);
		
		JLabel incomeTax = new JLabel("Income Tax");
		
	}
	
	
}
