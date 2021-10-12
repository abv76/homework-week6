//PRG-9: Write a program to convert the upper case to lower case --> i did lower to upper case by using b = a.toUpperCase
import java.util.Scanner;
public class CapsToSmall9 {
    //Static Variables
    static String a;
    static String b;

    static void convert() {       // User input data in Static method using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Text to convert in lower case:");
        a = scanner.nextLine();
        b = a.toUpperCase ();   //Converting String to Upper Case
        System.out.println("String : " + b);
    }
    //Static method calling in main method --> ** I just did the other way to convert to upper case **
    public static void main(String[] args)  {
        CapsToSmall9.convert();
    }
}

