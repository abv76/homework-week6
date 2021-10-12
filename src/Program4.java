/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */


public class Program4 {
    int a = 5;
    int b = 10;
    static int x = 30;
    static int y = 40;

    void prg41 (){
        System.out.println( a+b+x+y);
    }

    static void prg42 (){

        Program4 obj4 = new Program4();
        System.out.println( (obj4.a+obj4.b) + (x-y));

    }

    public static void main(String[] args) {
        Program4 obj44 = new Program4();
        obj44.prg41();
        prg42();
        // System.out.println(prg42());

    }


}
