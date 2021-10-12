/* program 19 -> Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Locale;

public class StringLowercase19 {
    static String txt;   //Static Variables
    static String txt2;

        static void toCovertInLowercase() {     //Static Method to input string
        System.out.println("System Input:");
        System.out.println("THE QUICK BROWN FOX JUMP OVER THE LAZY DOG..");
        txt = "THE QUICK BROWN FOX JUMP OVER THE LAZY DOG..";

        txt2 = txt.toLowerCase(Locale.ROOT);  //to convert text in lower case
        System.out.println("Your Result:");
        System.out.println(txt2);
    }

    public static void main(String[] args) { //main method to call static method result
        StringLowercase19.toCovertInLowercase();
    }

}