package ClassObjectMethod;
//main() can be present in the same class
public class ClassObjectMethodPractice      //class with variables and method
{
    int eid;                                // reference  variables
    String name;
    double sal;
    int deptno;
    String job;

    void display()      //void - no return type     // method , display is just a given name
    {
        System.out.println(eid);
        System.out.println(name);
        System.out.println(sal);
        System.out.println(deptno);
        System.out.println(job);
    }
}
