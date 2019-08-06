import java.util.Scanner;

public class PassOrFail                     //need to find out if student has passed the all the subjects
{
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Student's Name:");
            String name = scanner.nextLine();
            System.out.println("Input Student's Roll No.:");
            int n = scanner.nextInt();
            System.out.println("Enter marks of Gujarati subject");
            int gs = scanner.nextInt();
            System.out.println("Enter marks of Hindi subject");
            int hs = scanner.nextInt();
            System.out.println("Enter marks of Sanskrit subject");
            int ss = scanner.nextInt();
            System.out.println("Total marks of all the subjects" + " : " + (gs+hs+ss));           //it will calculate the marks of all the subjects
            System.out.println("Percentage of all the subjects" + " : " + ((gs+hs+ss)/3) + "%"); //will find the percentage on the basis of total marks

            if ((gs>=35)&&(hs>=35)&&(ss>=35))             //if-else condition is used to check if student has passed all the subjects
            {
               System.out.println("Student has pass all the subjects");
            }
            else
            {
                System.out.println("Fail");
            }
        }
    }
}