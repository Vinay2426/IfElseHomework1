public class MethodPractice
{
    int a = 10;                         //instant value, not static
    String name = "Method Practice";    //instant value, not static

    static int c = 500;

    public static void m1()
    {
        System.out.println("print");
    }

    public static void main(String[]args)
    {
        MethodPractice methodPractice = new MethodPractice();

        System.out.println(methodPractice.a);
        System.out.println(methodPractice.name);

        System.out.println(MethodPractice.c); //static value will print without creating object

        MethodPractice.m1();
    }
}
