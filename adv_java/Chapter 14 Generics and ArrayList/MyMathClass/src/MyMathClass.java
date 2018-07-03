
import java.util.ArrayList;

public class MyMathClass<T extends Number>
{
	private double average = 0; 
	private double standardDeviation = 0;
	
	public MyMathClass() 
	{	
	}
	public double standardDeviation(ArrayList<T> list)//T is a generic type
	{	
		for (T element : list)
		{
			average = (average + element.doubleValue()); //add
		}
		average = (average / list.size()); //divide to get avg
		
		for (T element : list) 
		{
			//double elem = element.doubleValue();
			standardDeviation = (standardDeviation + Math.pow((element.doubleValue() - average), 2)); //add
		}
		standardDeviation = (standardDeviation / list.size()); //divide to get avg
		standardDeviation = Math.pow(standardDeviation, 0.5); //sqrt to get stdDev
		return standardDeviation;
	}
}