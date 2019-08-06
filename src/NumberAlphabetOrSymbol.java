import java.util.Scanner;

public class NumberAlphabetOrSymbol
{
public static void main(String[]args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any Number, Character or Symbol : ");     //to find out if the character is alphabet, number of symbol
    char ch = scanner.next().charAt(0);

    /*if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'B')); //checking for alphabet
    {
        System.out.println("It is an Alphabet");
    }
    else if (ch >= '0' && ch <= '9');                          //checking for numbers
    {
        System.out.println("It is a Number");
    }
    else
    {
        System.out.println("It is a Symbol");               //rest of them are symbols
    } */

    if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) // checking for alphabet
    {
        System.out.println("It is an Alphabet");
    }
    else if (ch >= 48 && ch <= 57) {
        System.out.println("It is a Number");           //checking for numbers
    }
    else
    {
        System.out.println("it is a Symbol");           //rest of them are symbols
    }
}
}
