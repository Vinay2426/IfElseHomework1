import java.util.Scanner;

public class StudentsGrade                              //need to find student's marks total, %, result and grade
{
public static void main(String[]args)
{
    Scanner scanner = new Scanner (System.in);              //scanner method is called
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
    System.out.println("Total marks of all the subjects" + " : " + (gs+hs+ss)); //it will calculate the marks of all the subjects
    System.out.println("Percentage of all the subjects" + " : " + ((gs+hs+ss)/3) + "%"); //will find the percentage on the basis of total marks
    System.out.println((((gs+hs+ss)/3)>=35) ? "Pass" : "Fail");
    if (((gs+hs+ss)/3)>=80)                                 //grade A+ if % is more than 80
    {
     System.out.println("Grade A+");
    }
    else if (((gs+hs+ss)/3)>=60)                            //grade A if % is more than 60
    {
        System.out.println("Grade A");
    }
    else if (((gs+hs+ss)/3)>=50)                             //grade B if % is more than 50
    {
        System.out.println("Grade B");
    }
    else if (((gs+hs+ss)/3)>=35)                             //grade C if % is more than 40
    {
        System.out.println("Grade C");
    }
}
}
