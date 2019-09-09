public class ConvertStringToInteger
{
    public static void main(String[] args)
    {
    String s = "100";

    int i = Integer.parseInt(s);        //Converting String to int value using parseInt method

        System.out.println(s + 500);    //=100500, b'cus string "100" will be concatenation with int value 500 (here '+' will operate as concatenation
        // sign
        System.out.println(i + 500);    //=600, because here '+' is a binary plus operator
    }
}
