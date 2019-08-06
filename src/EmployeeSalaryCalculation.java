import java.util.Scanner;

public class EmployeeSalaryCalculation
{
public static void main(String[]args)                //employee's salary calculation
{
    Scanner scanner = new Scanner (System.in);       //scanner method is called
    System.out.println("Input Employee's Name:");
    String name = scanner.nextLine();
    System.out.println("Input Employee's ID:");
    int n = scanner.nextInt();
    System.out.println("Input Employee's Basic Salary:");
    double s = scanner.nextDouble();            // all the deduction HRA, TA, DA, PF will be calculated on the basic salary "s"
    System.out.println("HRA is :" + " " + ((s * 10)/100));
    System.out.println("TA is :" + " " + ((s * 8)/100));
    System.out.println("DA is :" + " " + ((s * 9)/100));
    System.out.println("PF is :" + " " + ((s * 20)/100));
    //totalled all the deduction with basic salary to find out gross salary
    System.out.println("Gross Salary is :" + " " + (((s+(s * 10)/100)+((s * 8)/100)+((s * 9)/100)+((s * 20)/100))));
}
}
