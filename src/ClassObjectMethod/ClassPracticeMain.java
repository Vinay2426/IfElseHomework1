package ClassObjectMethod;

public class ClassPracticeMain
{
    public static void main(String[] args)
    {
        ClassObjectMethodPractice emp1 = new ClassObjectMethodPractice(); //object has been created
        emp1.eid=101;
        emp1.name= "Dev";
        emp1.sal= 5000;
        emp1.deptno= 5;
        emp1.job="Operation Manager";

        emp1.display();     //will display the emp1's details

        ClassObjectMethodPractice emp2 = new ClassObjectMethodPractice();

        emp2.eid=1;
        emp2.name= "Rev";
        emp2.sal= 2500;
        emp2.deptno= 1;
        emp2.job="Manager";

        emp2.display();     //will display the emp2's details
    }
}
