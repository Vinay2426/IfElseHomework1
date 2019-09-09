public class MethodPracticeChildTest
{
    public static void main(String[]args)
    {
        MethodPractice methodPractice = new MethodPractice();

        System.out.println(methodPractice.a);
        System.out.println(methodPractice.name);

        System.out.println(MethodPractice.c); //static value will print without creating object

        MethodPractice.m1();
    }

}
