import java.util.Scanner;

public class StudentsGrade                              //need to find student's marks total, %, result and grade
{
public static void que3()

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

    int total = gs+hs+ss;
    System.out.println("Total marks of all the subjects" + " : " + (total)); //it will calculate the marks of all the subjects

    int percent = (total/3);
    System.out.println("Percentage of all the subjects" + " : "+percent+"%"); //will find the percentage on the basis of total marks
    System.out.println((((total)/3)>=35) ? "Pass" : "Fail");

    if (((percent))>=80)                                 //grade A+ if % is more than 80
    {
     System.out.println("Grade A+");
    }
    else if (((percent)>=60) )                           //grade A if % is more than 60
    {
        System.out.println("Grade A");
    }
    else if (((percent)>=50)  )                           //grade B if % is more than 50
    {
        System.out.println("Grade B");
    }
    else if (((percent))>=35)                             //grade C if % is more than 40
    {
        System.out.println("Grade C");
    }
}

public static void main(String args[]){
    StudentsGrade ob = new StudentsGrade();
    ob.que3();
}

}


/* public static void main(String[]args)

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

    int total = gs+hs+ss;
    System.out.println("Total marks of all the subjects" + " : " + (total)); //it will calculate the marks of all the subjects

    int percent = (total/3);
    System.out.println("Percentage of all the subjects" + " : "+percent+"%"); //will find the percentage on the basis of total marks
    System.out.println((((total)/3)>=35) ? "Pass" : "Fail");

    if (((percent))>=80)                                 //grade A+ if % is more than 80
    {
     System.out.println("Grade A+");
    }
    else if (((percent)>=60) )                           //grade A if % is more than 60
    {
        System.out.println("Grade A");
    }
    else if (((percent)>=50)  )                           //grade B if % is more than 50
    {
        System.out.println("Grade B");
    }
    else if (((percent))>=35)                             //grade C if % is more than 40
    {
        System.out.println("Grade C");
    }
}
*/
/* //method call
import java.util.Scanner;

public class Student_Result {

//enter details of the student
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int SubjectMarks[] = new int[4];
        System.out.println("Enter Student Name");
        String sn = scanner.next();
        System.out.println("Enter Roll no");
        int r = scanner.nextInt();

        for(int k=0; k < 4; k++)
       {
           System.out.println("Enter Subject Mark");
           //String sn = scanner.next();
           SubjectMarks[k] = scanner.nextInt();
       }
        //System.out.println("Enter Student Name");
        //String sn = scanner.next();
        //System.out.println("Enter Roll no");
        //int r = scanner.nextInt();
        //System.out.println("Science mark");
        //int sm = scanner.nextInt();
        //System.out.println("Maths mark");
        //int mm = scanner.nextInt();
        //System.out.println("Physics mark");
        //int pm = scanner.nextInt();
        //find the total mark,percentage and the result by ternary operator

        int totalMakrs = GetSubjectTotal(SubjectMarks);
        double subPerct = totalMakrs/SubjectMarks.length;
        System.out.println("Total mark is " + totalMakrs + " & the percentage is " + (totalMakrs / SubjectMarks.length) + "%");
        System.out.println("The result is " + ((subPerct) >= 35 ? "Pass" : "Fail"));
        if ((subPerct) >= 80) {
            System.out.println(" The Grade is A+ ");
        }
       else if ((subPerct) >= 60) {
           System.out.println(" The Grade is A ");
        }
        else if ((subPerct) >= 50) {
            System.out.println(" The Grade is B");
        }
        else if ((subPerct) >= 35) {
            System.out.println(" The Grade is C ");
        }
        else{}

       //System.out.println( (sm>=35 && mm>=35 && pm>=35)? "Pass in all Subject": " Fail");


    }

    public static int GetSubjectTotal(int[] subjectMarks)
    {
        int total = 0;
        for(int i = 0;i < subjectMarks.length ;i++)
        {
            total = total + subjectMarks[i];
        }

       // total = total/subjectMarks.length;
        return total;

    }

    public static String GetStudentResult(double studentPer)
    {
        String result = "pass";
        if(studentPer < 35.00)
        {
            result = "fail";
        }
        return result;
    }
}


 */
