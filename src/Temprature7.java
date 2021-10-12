// Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).

import java.util.Scanner;

public class Temprature7 {

    public void temp(double fahrenheit, double celsius ) {


        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
       // System.out.println(fahrenheit + " degree Fahrenheit = " + celsius + " degree Celsius");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double f = in.nextDouble();
        double c = (f - 32) * 5.0 / 9.0;

        Temprature7 object = new Temprature7();
        object.temp(f,c);
        

    }

}
