import java.util.Scanner;

public class ArithmeticSolution                     //user can add,subtract,multiply numbers
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);       //user allow to enter the number of his wish
        System.out.println("Enter the First Number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = scanner.nextInt();
        System.out.println("Input an Arithmetic Symbol of your wish : (+,-,*,/)");
        //int ch = scanner.nextInt();
        char ch = scanner.next().charAt(0);                 //char is used so we can use symbols for calculation

                if (ch == '+')                                      //for addition the value
            {
                System.out.println("Result is : " + (a+b));
            }
            else if (ch == '-')                                  //for subtract the value
            {
                System.out.println("Result is : " + (a-b));
            }
            else if (ch == '*')                                  //for multiply the value
            {
                System.out.println("Result is : " + (a*b));
            }
            else if(ch == '/')                                  //for divide the value
            {
                System.out.println("Result is : " + (a/b));
            }
    }
}