/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:  Input first number: 125
            Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class MathOperation18 {
    static int a =125;    //Static Variables
    static int b =24;

       static void calculations()     //Static method to perform calculation using System input
    {
        System.out.println("System Enter value one      :" +a);
        System.out.println("System Enter value two      :" +b);
        System.out.println("Total of both value         :"+ (a+b));
        System.out.println("Subtraction of both value   :" +(a-b));
        System.out.println("Multiplication of both value:" +(a*b));
        System.out.println("Division of both value      :" +(a/b));
        System.out.println("Modulus of both value       :" +(a%b));
    }

        public static void main(String[] args) {   //main method calling static method
        MathOperation18.calculations();

    }
}