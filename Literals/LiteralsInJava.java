public class LiteralsInJava {
    public static void main(String[] args) {
        /*

        A literal is a fixed value written directly in a Java program.

        In simple words: A literal is the actual value assigned to a variable.

        Types of Literals in Java

        Java has several types of literals:

        1. Integer Literals
        2. Floating-Point Literals
        3. Character Literals
        4. String Literals
        5. Boolean Literals
        6. Null Literal


         */

        int age = 20;
        double salary = 50000.50;
        char grade = 'A';
        String name = "Rahul";
        boolean passed = true;
        int num = 0b101;
        System.out.println(num); // this Prints "5"
        int num2 = 0xa1;
        System.out.println(num2); // this Prints "161"
        int num3 = 10_00_00_000;
        System.out.println(num3); // this Prints "100000000"
        double num4 = 56;
        System.out.println(num4); // this Prints "56.0"
        double num5 = 12e10;
        System.out.println(num5); // this Prints "1.2E11"
        char c = 'a';
        System.out.println(c); // this Prints "a"
        c++;
        System.out.println(c); // this Prints "b"




    }
}