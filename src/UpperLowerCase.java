import java.util.Scanner;

public class UpperLowerCase                     //changing upper case letter/s to lower case
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);       //scanner method for user inputs
        System.out.println("Enter letter/s in Upper Case : ");
        String UpperLetter = scanner.nextLine();        //string used for input of the letters
        System.out.println("Result in Lower Case : ");
        System.out.println(UpperLetter.toLowerCase());
    }
}
