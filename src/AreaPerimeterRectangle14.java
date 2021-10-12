/*    ***  print the area and perimeter of a rectangle  ***
Write a Java program to print the area and perimeter of a rectangle.
Test Data       : Width = 5.5 Height = 8.5
Expected Output : Area is 5.6 * 8.5 = 47.60  --> some misprint as result is 46.75
Perimeter is    : 2 * (5.6 + 8.5) = 28.20    --> some misprint as result is
 */
import java.util.Scanner;

public class AreaPerimeterRectangle14 {    // instance method : height and Width are given and calculated in result using
       void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rectangle Width:");
        double a = scanner.nextDouble();
        System.out.println("Enter Rectangle Height:");
        double b = scanner.nextDouble();

        System.out.println("Area of Rectangle is :" + (a * b));
        System.out.println("Perimeter of Rectangle is: " + (2 * (a + b)));
    }
       public static void main(String[] args) {   // main method, object created and result comes as desired.
        AreaPerimeterRectangle14 area = new AreaPerimeterRectangle14();
        area.area();
    }
}