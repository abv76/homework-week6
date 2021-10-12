/*
Write a program for a calculator with addition, subtraction, multiplication and division methods all
with parameters and use string concatenation methods.(Note: Two static and Two instance methods.) */

// public class

import java.util.Scanner;

public class Calculator5 {
        static void add(double a, double b) { //Static Method 1
        System.out.println("Total Addition:" + (a + b));
    }
        static void sub(double a, double b) ////Static method 2
    {
        System.out.println("Subtract:" + (a - b));
    }

    //Instance Method 1
    void multi(double a, double b)
    {
        System.out.println("Multiply :" + a * b);
    }
    //Instance Method 2
    void devi(double a, double b)
    {
        System.out.println("Division :" + (a / b));
    }


    public static void main(String[] args) {   //Main method calling Instance and Static Methods
        //user input via Scanner method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value:");
        double a = scanner.nextDouble();
        System.out.println("Enter the Second Value:");
        double b = scanner.nextDouble();
        //calling Static Method
        add(a, b); //total
        sub(a, b); // Subtract
        // calling Instance Method
        Calculator5 var = new Calculator5();
        var.multi(a, b);//Multiply
        var.devi(a, b); // Division
    }


}