// Write a Java program that takes three numbers as input to calculate and print the average of the numbers //

import java.util.Scanner;

public class Average13 {

    void  data(int a, int b, float c){        //Instance method
        //int a,b,c,d;
        //calculating average for 3 values
        float d = ((a+b+c)/3);
        System.out.println("Average of Three Value is :"+ d);
    }
    public static void main(String[] args) {   //Main method calling Instance method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Value:");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Second Value:");
        int b = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Third Value:");
        float c = scanner2.nextFloat ();

        Average13 ave = new Average13();
        ave.data(a,b,c) ;

    }
}
