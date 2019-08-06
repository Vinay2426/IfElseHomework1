import java.util.Scanner;

public class VotingEligibility
{
public static void main(String[]args)
{
    Scanner scanner = new Scanner(System.in);   //this method used so candidate can enter his/her age
    System.out.println("Enter the Age of Candidate : ");
    int age=scanner.nextInt();

    if (age>=18)                                //minimum 18 years required to vote
    {
        System.out.println("Candidate can Vote");
    }
    else
        {
            System.out.println("Candidate can not Vote");
        }
}
}