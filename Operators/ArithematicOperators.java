public class ArithematicOperators {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 4;

        int add = num1 + num2;
        System.out.println(add);

        int sub = num1 - num2;
        System.out.println(sub);

        int mul = num1 * num2;
        System.out.println(mul);

        int div = num1 / num2;
        System.out.println(div);

        // num1 = num1 + 2;
        num1 += 2;

        System.out.println(num1);

        num1++; // Post Increment
        ++num1; // Pre Increment
        System.out.println(num1);

        num1--; // Post Decrement
        --num1; // Post Decrement
        System.out.println(num1);

    }
}