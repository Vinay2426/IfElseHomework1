package ClassObjectMethod;

public class ConstructorOverLoading
{
    ConstructorOverLoading(int a, int b)
    {
        System.out.println(a + b);
    }
    ConstructorOverLoading(int a, double b)
    {
        System.out.println(a + b);
    }
    ConstructorOverLoading(double a, int b)
    {
        System.out.println(a + b);
    }
    ConstructorOverLoading(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    public static void main(String[] args)
    {
        ConstructorOverLoading constructorOverLoading = new ConstructorOverLoading(10, 20); //1

        new ConstructorOverLoading(10,20, 30);  //4

        new ConstructorOverLoading(10, 20.5); //2

        new ConstructorOverLoading(10.9,20);  //3
    }
}
