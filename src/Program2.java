/*Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
*/


public class Program2 {

    //2.1 Declare two static variables

    static char a ='C';             //static variable
    static String  name= "Hello";   // static variable

    //2.2  Declare one static method

    //This is static method.

    static void m2() {

        // 2.3 Call both static variables into the static method inside the print statement.

        System.out.println(a);
        System.out.println(name);

    }
    // 2.4 Declare the Main method.

    public static void main(String[] args) {

        //Call the static method into the Main method  and Run the programme.

        m2();     //call static method by class name

        // Program1 xxx = new Program1(); // to test

        // xxx.m1(); // called from program1 just to understand

    }

}