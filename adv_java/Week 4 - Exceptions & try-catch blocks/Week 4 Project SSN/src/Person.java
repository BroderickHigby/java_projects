import java.util.*;

public class Person
{
    private String name;
    private int age;

    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the person's name?");
        name = keyboard.nextLine();

        System.out.println("What is the person's age?");
        age = keyboard.nextInt();
        while (age < 0)
        {
            System.out.println("Age cannot be negative.");
            System.out.println("Reenter age:");
            age = keyboard.nextInt();
        }
    }

    public void writeOutput()
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public void set(String newName, int newAge)
    {
        name = newName;
        if (newAge >= 0)
            age = newAge;
        else
        {
            System.out.println("ERROR: Used a negative age.");
            System.exit(0);
        }
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}
