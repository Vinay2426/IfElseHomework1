package ClassObjectMethod;

public class PracticeTwo        //creating student id
{                               // practice of class  variables; three types are mention below
int sid;
String sname;
char grade;

PracticeTwo(int id, String name, char g) // (3) constructor
{
sid = id;
sname = name;
grade = g;

}

                                            // (2) method (it is special type of method, used for initializing the class variables, name should be same as class, it will not return any value(not even void), will be invoked at the time of object creation.
void getValues(int id, String name, char g) //another method created to assign value. this take parameter
{                                           // this will take three parameter as value, int, string, char
    sid = id;
    sname = name;
    grade = g;
}
                //for (1) reference variable
void display() //this method does not take parameter
{
    System.out.println(sid +" "+sname+" "+grade);
}
}
