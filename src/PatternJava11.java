//  Write a Java program to display the following pattern.  Sample Pattern :  J A V A //
public class PatternJava11 {

    public static void main(String[] args) {   //main method
        PatternJava11 pattern = new PatternJava11();
        pattern.java();
    }

    void java(){  // instance method
        System.out.println("     J    a   v     v  a");
        System.out.println("     J   aaa   v   v  aaa");
        System.out.println("J    J  aaaaa   v v  aaaaa");
        System.out.println("J J  J a     a   v  a     a");

    }

}