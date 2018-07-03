import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeList
{
	private LinkedList<Employee> employees = new LinkedList<>();

	public void reverse()
	{
		Iterator<Employee> reverse = employees.descendingIterator();
		LinkedList<Employee> reverseList = new LinkedList<>();

		if (reverse.hasNext())
		{
			for (Employee next = reverse.next(); reverse.hasNext(); next = reverse.next())
			{
				reverseList.add(next);
			}
			employees = reverseList;
		}
	}

	public void removeEveryOther()
	{
		for (int i = 0; i < employees.size(); i += 2)
		{
			employees.remove(i);
		}
	}
	
	public void drawList()
	{
		if (employees.size() > 0)
		{
			employees.get(0).draw();
			for(int i = 1; i < employees.size(); ++i)
			{
				System.out.println();
				System.out.println("^");
				System.out.println("|");
				System.out.println("v");
				System.out.println();
				employees.get(i).draw();
			}
		}
	}

	public double getTotalMonthlySalaries()
	{
		return employees.stream()			
				.mapToDouble(Employee::getMonthlySalary)
				.sum();	
	}
	
	
	public LinkedList<Employee> getEmployees()
	{
		return employees;
	}

	public void setEmployees(LinkedList<Employee> employees)
	{
		this.employees = employees;
	}

}