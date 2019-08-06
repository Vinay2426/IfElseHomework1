import java.util.Scanner;

public class PositiveOrNegative
{
public static void main(String[]args)
{
    Scanner scanner = new Scanner(System.in); //scanner method used for choosing the number
    System.out.println("Input Any Number : ");
    int a = scanner.nextInt();
    if (a > 0)                                //any value less than zero is negative
    {
        System.out.println("Value is Positive");
    }
    else if (a < 0)                           //any value more than zero is positive
    {
        System.out.println("Value is Negative");
    }
    else
    {
        System.out.println("Value is Zero");
    }
}
}
