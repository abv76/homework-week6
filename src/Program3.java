/*  3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme. */
 // ** remarked lines are just for tests - please ignore //

public class Program3 {

    int a = 1;
    static int b = 2;

    static void p3() {

        Program3 obj3 = new Program3();
        // obj3.a; // just to test
        System.out.println(obj3.a + b);
    }

    void addition() {
        a = 25;
        b = 35;

        System.out.println(a + b);
    }

    public static void main(String[] args) {
        // int a = 20;
        // b = 30;
        Program3 obj32 = new Program3();
        obj32.addition();
        // System.out.println(a);
        System.out.println(b);
        p3();


    }


}
