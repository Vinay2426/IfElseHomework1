package ClassObjectMethod;

public class OverloadMainMethod     //we can use many main method in one class but it should be with different parameter/s.
{
    public void main(int x)
    {
        System.out.println(x);
    }
    public void main(int x, int y)
    {
        System.out.println(x + y);
    }

    public static void main(String[] args)
    {
        OverloadMainMethod overloadMainMethod = new OverloadMainMethod();

        overloadMainMethod.main(100); //1
        overloadMainMethod.main(100, 200); //2
    }
}