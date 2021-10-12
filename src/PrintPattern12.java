//  Write a Java program to compute the specified expressions and print the output.

public class PrintPattern12 {

       public static void main(String[] args) {   //main method calling static method
        PrintPattern12.test();
    }

    static void test() {  //System input using static method
        // Test Data:  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        // Expected Output : 2.138888888888889

        double ans = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("TestDATA:(25.5*3.5-3.5*3.5)/(40.5-4.5) ");
        System.out.println("Output:" + ans);
        // ** note ** --> to round off the figure below formula to be used result will be 2.0
        //double roundOff  = Math.round((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        //System.out.println("TestDATA:(25.5*3.5-3.5*3.5)/(40.5-4.5) ");
        //System.out.println("Output:" + ans);
    }
}