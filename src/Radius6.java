// Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).

public class Radius6 {
    static void area(){
        int r = 14;
        double A;
        final double pi = Math.PI;
        A = (pi*r*r);
        System.out.println("Area of circle: "+ A);
    }

    public static void main(String[] args) {    // Main Method
        Radius6.area();                        //Static variable called by class name

    }

}
