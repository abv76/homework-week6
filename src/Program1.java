
/* 1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
*/


public class Program1 {

    //1.1 Declare two instance variables.

    int a= 7;           // instance variable
    String name= "aaa";// instance variable

    //1.2 Declare one instance method.

    void m1() {
        //Instance area

        // 1.3 Call both instance variables into the instance method inside the print statement.

        System.out.println(a);
        System.out.println(name);
    }

    // 1.4 This is a main method.

    public static void main(String[] args) {


        //1.5 Call the above instance method into the Main method and Run the programme.

        Program1 obj = new Program1();
        obj.m1();


    }
}