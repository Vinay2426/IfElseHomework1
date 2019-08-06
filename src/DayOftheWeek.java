import java.util.Scanner;

public class DayOftheWeek
{
public static void main(String[]args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Week's Number : ");
    int n = scanner.nextInt(); //enter 1-7 number ot find the day of week

    if (n == 1)                                 //first day of week is monday
    {
        System.out.println("Monday");
    }
    else if (n == 2)
    {
        System.out.println("Tuesday");          //first day of week is tuesday
    }
    else if (n == 3)
    {
        System.out.println("Wednesday");       //first day of week is wednesday
    }
    else if (n == 4)
    {
        System.out.println("Thursday");         //first day of week is thursday
    }
    else if (n == 5)
    {
        System.out.println("Friday");           //first day of week is friday
    }
    else if (n == 6)
    {
        System.out.println("Saturday");         //first day of week is saturday
    }
    else if (n == 7)
    {
        System.out.println("Sunday");           //first day of week is sunday
    }
    else
    {
        System.out.println("Invalid Entry"); //week has only 7 days so rest of numbers and symbols are invalid entry
    }
}
}
