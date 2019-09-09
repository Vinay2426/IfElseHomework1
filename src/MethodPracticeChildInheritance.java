public class MethodPracticeChildInheritance extends MethodPractice
{
    //practice of variable and method call directly and by object along with inheritance

    int b = 50;
    static String surname = "sub test";

    public static void main(String[]args)
    {
        //don't need to create object to call static method
        System.out.println(surname);        //if surname is static you can called it here directly
        System.out.println(c);        // b is static in 'method practice' which parent class (super class) of current class (child class/sub class)

       //need object to call instant variable and string
        MethodPracticeChildInheritance childTest = new MethodPracticeChildInheritance();

        System.out.println(childTest.a);    //a is already in 'method practice inheritance' because we extend this class to 'method practice'
        System.out.println(childTest.b);    //need object to call instant variable b


    }
}
