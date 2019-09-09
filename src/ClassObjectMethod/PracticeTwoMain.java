package ClassObjectMethod;

public class PracticeTwoMain
{
    public static void main(String[] args)
    {
    //PracticeTwo stu1 = new PracticeTwo();

    /* (1) assign value by reference variable
    stu1.sid=525;
    stu1.sname="Dev";
    stu1.grade='A';

    stu1.display();
    */

    /* (2) assign values by method
    stu1.getValues(525, "Dev", 'A');

    stu1.display();
     */

      //  (3) assign values by using constructor
    PracticeTwo stu1 = new PracticeTwo(525, "Dev", 'A');
    stu1.display();

    }
}
