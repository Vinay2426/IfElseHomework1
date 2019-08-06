import java.util.Scanner;

public class VowelOrConsonant
{
public static void main(String[]args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input an Alphabet : ");
    char ch = scanner.next().charAt(0);             //enter character to find if it's vowel or consonant

    if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        System.out.println("Input letter is Vowel");
    }
    else
    {
        System.out.println("Input letter is Consonant");
    }
}
}
