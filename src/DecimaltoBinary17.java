/*  prg-17 - Write a Java program to convert a decimal number to binary number.
    1 Input Data: a Decimal Number : 5
    2 Expected Output  Binary number is: 101 */

public class DecimaltoBinary17 {

    public static void toBinary(int decimal) {      //Converting Int to Binary using Static Method
        System.out.println(Integer.toBinaryString(decimal));

    }

    public static void main(String[] args) {     //Main method with System input and calling static method
        System.out.println("Decimal Number : 5");
        toBinary(5);
    }
}