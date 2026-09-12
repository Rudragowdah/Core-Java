class Calculator
{

    // Method OverLoading is the Same Name With Different Number of parameters or Type of parameters.
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloadingInJava
{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int r1 = calc.add(10, 20);
        System.out.println("Result: " + r1);
        int r2 = calc.add(10, 20, 30);
        System.out.println("Result: " + r2);
        double r3 = calc.add(10.5, 12.54);
        System.out.println("Result: " + r3);
    }

}