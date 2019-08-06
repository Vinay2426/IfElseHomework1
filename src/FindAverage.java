import java.util.Scanner;

public class FindAverage
{
public static void main(String[]args)
{                                                         // scanner method is imported so user can input numbers
    Scanner scanner = new Scanner (System.in);            //need to find the average value of five input numbers
    System.out.println("Input First Number :");
    int a = scanner.nextInt();
    System.out.println("Input Second Number :");
    int b = scanner.nextInt();
    System.out.println("Input Third Number :");
    int c = scanner.nextInt();
    System.out.println("Input Fourth Number :");
    int d = scanner.nextInt();
    System.out.println("Input Fifth Number :");
    int e = scanner.nextInt();
    System.out.println("Average of the Five Number is :" + " " + ((a+b+c+d+e)/5));
}
}