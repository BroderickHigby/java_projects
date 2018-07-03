
import java.awt.*;
import javax.swing.*;

public class MaritalStatus extends JPanel 
{
	public final int SINGLE_RATE = 28;
	public final int MARRIED_RATE = 32;
	public final int SINGLE_HEAD_HOUSEHOLD_RATE = 22;
	
	private JRadioButton singleStatus;
	private JRadioButton marriedStatus;
	private JRadioButton headHouseholdStatus;
	
	private ButtonGroup bg;
	
	public MaritalStatus()
	{
		setLayout(new GridLayout(3,1));
		setBackground(Color.WHITE);
		
		singleStatus = new JRadioButton("Single", true);
		marriedStatus = new JRadioButton("Married");
		headHouseholdStatus = new JRadioButton("Single, Head of Household");
		
		
		bg = new ButtonGroup();
		bg.add(singleStatus);
		bg.add(marriedStatus);
		bg.add(headHouseholdStatus);
		
		add(singleStatus);
		add(marriedStatus);
		add(headHouseholdStatus);
	}
	
	public int getMaritalStatus()
	{
		int maritalStatus = 0;
		
		if(singleStatus.isSelected())
		{
			maritalStatus = SINGLE_RATE; 
		}
		else if(marriedStatus.isSelected())
		{
			maritalStatus = MARRIED_RATE;
		}
		else
		{
			maritalStatus = SINGLE_HEAD_HOUSEHOLD_RATE;
		}
		return maritalStatus;
	}
}
