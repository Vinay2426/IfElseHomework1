public class StringPractice //inbuilt string methods need to learn
{
    public static void main(String[]args)
    {
        //System.out.println("Hello world!");
        String s = "hello java";
        String s1 = "Hello World!";
        String s2 = "Hello World!";
        String s3 = "";
        String s4 = " Let's learn Java ";

        System.out.println(s1);
        System.out.println(s2.compareTo(s1)); //will compare strings and will return 0 if both are equal
        System.out.println(s2 == s1); //will compare string and give false or true


        s1=s1.concat("Java is Best"); // will concat to s1
        System.out.println(s1);

        System.out.println(s3.isEmpty()); //should return true, it will return false if there's even space
        System.out.println(s2.isEmpty());   //return false

        System.out.println(s4); // it will print original with spaces
        System.out.println(s4.trim()); //removes the leading and trailing spaces

        int value = 20;
        String valueString = String.valueOf(value); //it will convert integer value to string
        System.out.println(valueString + 19);       //converted value to string will concatenation with with 19 rather than doing total of 20+19 and will return 2019 instead of 39

        System.out.println(s.contains("hello")); //will check if string s contains specific word and return true or false
        System.out.println(s1.equalsIgnoreCase(s2)); //compare the string ignoring upper or lower case/s

        System.out.println(s.charAt(6));
        System.out.println(s.substring(2));
        System.out.println(s.substring(1,7));
        System.out.println(s.replace("java", "kava")); //replace whole string word/s or certain character
        System.out.println(s.toUpperCase());
        System.out.println("HELLO WORLD".toLowerCase());
        System.out.println("HELLO WORLD".toCharArray()[2]);
        System.out.println("$250".startsWith("£"));
        System.out.println("EURUSD".endsWith("USD"));
    }
}
