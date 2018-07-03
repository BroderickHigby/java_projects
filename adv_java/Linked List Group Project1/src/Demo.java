import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		EmployeeList empList = new EmployeeList();
		double sumMonthlySalaries;
		
		for (int i = 0; i < 2; i++)
		{
			empList.getEmployees().add(Employee.inputEmployee(input));
		}
		sumMonthlySalaries = empList.getTotalMonthlySalaries();
		System.out.println();
		empList.drawList();
		System.out.println();
		System.out.println("Cumulitive Monthly Salary: " + sumMonthlySalaries);
		System.out.println("Cumulitive Yearly Salary: " + Employee.monthlySalaryToYearly(sumMonthlySalaries));
		input.close();
	}
}
