import java.util.Scanner;                       //scanner class imported for this method

public class EvenOddValue                       //ternary operator has been used to find if the value is even or odd
{
public static void main(String []args)
{
    Scanner scanner = new Scanner (System.in);  //scanner method is used to enter the value in console
System.out.println("Enter the first value");
int a = scanner.nextInt();
System.out.println((a%2==0) ? "The value is Even" : "The value is Odd");

    System.out.println("Enter the second value");
    int b = scanner.nextInt();
    System.out.println((b%2==0) ? "The value is Even" : "The value is Odd");
}
}
/*int n = 2;
Scanner scanner = new Scanner (System.in);
System.out.println("Enter the value you want to check if it is Even or Odd");
int n = scanner.nextInt();
if(n%2 == 0)
{
    System.out.println("Value is Even number");
}
else
{
    System.out.println("Value is Odd number");
}
}*/

