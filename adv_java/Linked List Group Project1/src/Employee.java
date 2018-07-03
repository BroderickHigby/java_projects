import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*Algorithm:
 * 1.Create Employee class
 * 		name String,dateofBirth localDate,monthlySalary Double,bonusAmount Double,years Int
 * 		setters,getters,Constructor...
 * 2.Input method takes Scanner object
 * 		Prompt user for values of instances
 * 		Scan in input from user
 * 		instantiate object
 * 		return reference to object
 * 3.Create EmployeeList
 * 		add 10 Employee, call input method
 * 4.remove every other employee object
 * 5.Create drawEmployee, drawAll, reverse, addSalaries(add monthly, multiply by 12(display before),  add bonus amounts(display after))  methods
 * 6.use methods to draw the linked list(3-4 elements)
 * 7.Create tester to use all created methods and 4-5 from the linked list class.
 */

public class Employee
{
	private String		name;
	private LocalDate	dateOfBirth;
	private double		monthlySalary;
	private double		bonusInput;
	private int			year;

	public Employee(String newName, LocalDate dateOfBirth, double monthlySalary, double bonusInput, int year)
	{
		this.name = newName;
		this.dateOfBirth = dateOfBirth;
		this.monthlySalary = monthlySalary;
		this.bonusInput = bonusInput;
		this.year = year;

	}

	public Employee()
	{
		name = "no name";
		dateOfBirth = null;
		monthlySalary = 0;
		bonusInput = 0;
		year = 0;

	}

	public static Employee inputEmployee(Scanner input)
	{
		String name;
		LocalDate DOB;
		double monthlySalary;
		double bonusInput;
		int year;
		Employee person;

		System.out.println("enter name");
		name = input.nextLine();
		System.out.println("date - mm/dd/yyyy");
		DOB = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		System.out.println("month salary");
		monthlySalary = Double.parseDouble(input.nextLine());
		System.out.println("bonus?");
		bonusInput = Double.parseDouble(input.nextLine());
		System.out.println("how many years?");
		year = Integer.parseInt(input.nextLine());

		person = new Employee(name, DOB, monthlySalary, bonusInput, year);

		return person;
	}
	
	public static double monthlySalaryToYearly(double monthlySalary)
	{
		return monthlySalary * 12;
	}
	
	public void draw()
	{
		String dashes = "";
		for (int magicWidth = 0; magicWidth < 30; ++magicWidth)
		{
			dashes += "-";
		}
		
		System.out.println(dashes);
		System.out.printf("| Name: %20s |\n", name);
		System.out.printf("| DOB: %21s |\n", dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		System.out.printf("| Monthly Salary: %10.2f |\n", monthlySalary);
		System.out.printf("| Bonus: %19.2f |\n", bonusInput);
		System.out.printf("| Years: %19d |\n", year);
		System.out.println(dashes);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public double getMonthlySalary()
	{
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}

	public double getBonusInput()
	{
		return bonusInput;
	}

	public void setBonusInput(double bonusInput)
	{
		this.bonusInput = bonusInput;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

}
