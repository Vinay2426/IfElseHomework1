package ClassObjectMethod;

public class MethodOverLoading
{
        void add (int a, int b)     //method 1
        {
            System.out.println(a+b);
        }
        void add (int a, double b)      //method 2
        {
            System.out.println(a+b);
        }
        void add (double a, double b)       //method 3
        {
            System.out.println(a+b);
        }
        void add (int a, int b, int c)      //method 4
        {
            System.out.println(a+b+c);
        }

    public static void main(String[] args)
    {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.add(10,20); //method 1
        methodOverLoading.add(10, 20.5); //2
        methodOverLoading.add(10.5, 10.0); //3
        methodOverLoading.add(10,20, 30);  //4
    }
}