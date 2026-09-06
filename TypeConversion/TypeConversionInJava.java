public class TypeConversionInJava {
    public static void main(String[] args) {
        byte b = 127;
        int a = 12;
        // b = a; -> This will Throw Error Because int (Longer Size Value) Cannot be Assigned to byte (Shorter Size Value).
        // a = b; => this Will Work and it is Called Type Conversion. The Compiler will Automatically Perform the Type Conversion Operation;
         b = (byte) a;
         System.out.println("a = " + a); // a = 12
        System.out.println("b = " + b); // b = 12

        byte c = 127;
        int d = 1233;

        c = (byte) d;
        System.out.println("c = " + c); // c = -47 -> Some data is lost Here... And This is Obtained like this Below Logic.
        // 1233 % 256;


        System.out.println("d = " + d); // d = 1233

        float f = 5.6f;
        a = (int) f;
        System.out.println("a = " + a); // a = 5

        // The Below is the Type Promotion

        byte num1 = 10;
        byte num2 = 30;

        int result = num1 * num2; // Here the MUL of two Byte Might be promoted to int and this is called Type Promotion.

        System.out.println("Result : " + result); // prints "Result : 300"
    }
}