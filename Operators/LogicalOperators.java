public class LogicalOperators {
    public static void main(String[] args) {

        // Logical And (&), Logical OR (|), Logical Not (!)

        // Short Circuit And (&&)

        // Short Circuit OR (||)

        int x = 5;
        int y = 7;
        int a = 5;
        int b = 9;

        boolean result;

        result = x > y && a < b;
        System.out.println("result = " + result);

        result = x > y || a < b;
        System.out.println("result = " + result);

        result = !(x > y || a < b);
        System.out.println("result = " + result);
    }
}