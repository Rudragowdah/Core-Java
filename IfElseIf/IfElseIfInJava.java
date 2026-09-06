public class IfElseIfInJava {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 30;

        if (x > y && x > z)
            System.out.println("x is Greater");
        else if (y > z)
            System.out.println("y is Greater");
        else
            System.out.println("z is Greater");

    }
}