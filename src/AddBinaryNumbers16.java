/*     program to add two binary numbers.
        Input Data:     Input first binary number: 10
                        Input second binary number: 11
        Expected Output:  Sum of two binary numbers: 101
  */

import java.util.Scanner;

public class AddBinaryNumbers16 {

    public static void main(String[] args) {    // Binary Numbers to input
        System.out.println("Program to add two binary numbers");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter first binary number");
        String first = scan1.nextLine();
        System.out.println("Enter second binary number");
        String second = scan1.nextLine();

        String sum = sum (first, second);

        System.out.println("Sum of two binary number: " + sum);   //Result Displayed here
        scan1.close();

    }
    //Static method for adding String and Converting to Binary
    private static String sum(String first, String second) {
        //Convert String to Integer
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        // adding Integer
        int sum = b1 + b2;
        // converting to Binary and return to main
        return Integer.toBinaryString(sum);

    }
}