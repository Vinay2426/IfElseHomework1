import java.util.Scanner;

public class PassOrFail                     //need to find out if student has passed the all the subjects
{
static int gs,hs,ss;
    public static void que4(){
        StudentsGrade.que3();

        if ((gs>=35)&&(hs>=35)&&(ss>=35))             //if-else condition is used to check if student has passed all the subjects
        {
            System.out.println("Student has pass all the subjects");
        }
        else {
            System.out.println("Fail");
        }}
    public static void main(String[]args){
        PassOrFail.que4();

    }

       /*{
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
        } */
}

/*
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

        import java.util.Scanner;


public class Pass_Fail {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String sn = scanner.next();
        System.out.println("Enter Roll no");
        int r = scanner.nextInt();
        System.out.println("Science mark");
        int sm = scanner.nextInt();
        System.out.println("Maths mark");
        int mm = scanner.nextInt();
        System.out.println("Physics mark");
        int pm = scanner.nextInt();
        int SubjectMarks[] = {sm,mm,pm};
        int SubjectTotal = Student_Result.GetSubjectTotal(SubjectMarks);
        double StudentPerc = SubjectTotal/SubjectMarks.length;
        //String result =
        //String result = Student_Result.GetStudentResult((Student_Result.GetSubjectTotal(SubjectMarks)/SubjectMarks.length));
        //  System.out.println("Total mark is " + Student_Result.GetSubjectTotal(SubjectMarks) + " & the percentage is " + ((sm + mm + pm) / 3) + "%");
       /* System.out.println("Total mark is " + (sm + mm + pm) + " & the percentage is " + ((sm + mm + pm) / 3) + "%");
        System.out.println("The result is " + (((sm + mm + pm) / 3) >= 35 ? "Pass" : "Fail"));
       // if (((sm + mm + pm) / 3) >= 80) {
            System.out.println(" The Grade is A+ ");
        }
       // else if (((sm + mm + pm) / 3) >= 60) {
              System.out.println(" The Grade is A ");
        }
        else if (((sm + mm + pm) / 3) >= 50) {
            System.out.println(" The Grade is B");
        }
        else if (((sm + mm + pm) / 3) >= 35) {
            System.out.println(" The Grade is C ");
        }
        else{}

//Student declare pass if he/she pass in all subjects
//System.out.println( (sm>=35 && mm>=35 && pm>=35)? "Pass in all Subjects": " Fail");
        System.out.println(Student_Result.GetStudentResult(StudentPerc));



                }

                }



                */