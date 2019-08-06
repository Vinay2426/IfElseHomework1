import java.util.Scanner;

public class InterchangeTheValue
{
public static void main(String[]args)
{
    int x, y, z;               // Three int value are chosen which can help to interchange the numbers
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input the Value of X");
    x = scanner.nextInt();
    System.out.println("Input the Value of Y");
    y = scanner.nextInt();

    z = x;                      // z will help to interchange the numbers
    x = y;
    y = z;
                                //print command for interchanged value
    System.out.println("Interchanged Value of X is" + " " + x + " and Value of Y is" + " " + y);
}
}