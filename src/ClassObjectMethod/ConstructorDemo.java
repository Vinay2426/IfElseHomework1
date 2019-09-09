package ClassObjectMethod;
/*
public class ConstructorDemo        //default constructor
{
    int x;
    int y;

    ConstructorDemo()
    {
        x=10;
        y=20;
    }
    void display ()
    {
        System.out.println(x+y);
    }

    public static void main(String[] args)
    {
        ConstructorDemo cm = new ConstructorDemo(); //Invokes default constructor
        cm.display();
    }
 */
    public class ConstructorDemo        //parameterized constructor
    {
        int x;
        int y;

        ConstructorDemo(int a, int b)   //parameterized constructor
        {
            x=a;
            y=b;
        }
        void display ()
        {
            System.out.println(x+y);
        }

        public static void main(String[] args)
        {
            ConstructorDemo cm = new ConstructorDemo(100,200); //Invokes parameterized constructor
            cm.display();
        }
    }
