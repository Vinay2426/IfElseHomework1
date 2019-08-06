import java.util.Scanner;

public class SalesCommission
{                                           //need to find sales commission
public static void main(String []args)
{
    Scanner scanner = new Scanner (System.in);
    System.out.println("Input Seller's Name:"); //Seller's details
    String name = scanner.nextLine();
    System.out.println("Input Seller's ID:");
    int n = scanner.nextInt();
    System.out.println("Input Sales Amount:");
    double s = scanner.nextDouble();            //s is the amount of sales

    if (s>=50000)                               //35% commission if sales is more than 50,000
    {
        System.out.println("Commission Amount"+" : "+((s*35)/100));
    }
    else if (s>=30000)                           //20% commission if sales is more than 30,000
    {
        System.out.println("Commission"+" : "+((s*20)/100));
    }
    else if (s>=20000)                            //10% commission if sales is more than 20,000
    {
        System.out.println("Commission"+" : "+((s*10)/100));
    }
    else if (s>=10000)                             //5% commission if sales is more than 10,000
    {
        System.out.println("Commission"+" : "+((s*5)/100));
    }
    else if (s<10000)                              //2% commission if sales is less than 10,000
    {
        System.out.println("Commission"+" : "+((s*2)/100));
    }
}
}
