public class WrapperClasses  {
    public static void main(String[] args) {
        int num = 7;
//        Integer num1 = new Integer(num); // Assigning a Primitive Data to a Wrapper Object is called Boxing.

        // The Above Line Is Deprecated, So you will get a Warning.

        Integer num1 = num; // This is Called Auto-Boxing. The Boxing is Done Implecitly in Latest Java Versions.

//        int num2 = num1.intValue(); // This is Called Un-Boxing.
        // Assigning a Wrapper Class Object Value to a primitive type variable is called Unboxing.

        int num2 = num1; // This is Auto-Unboxing. This is Done Implicitly in java.

        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 2);
    }
}