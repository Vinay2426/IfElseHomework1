import java.util.Scanner;               //scanner class has been used to input year in the console

public class LeapYearCheck              //if-else method has been used here
{
public static void main(String [] args)
{
 Scanner scanner = new Scanner (System.in);
 System.out.println("Enter any year");
 int year = scanner.nextInt();
 if (year % 4 == 0)                     //if year is divided by 4 then it's leap year
 {                                      //if-else method has been used here
     System.out.println("Year is Leap Year");
 }
 else
 {
     System.out.println("Year is not Leap Year");
 }
}
}
