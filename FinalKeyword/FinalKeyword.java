
// Final - Variable, Method, Class.

//final class Calc { // This cannot be inherited by any other class
//    public void show() {
//        System.out.println("Done By Rudra");
//    }
//    public void add(int a, int b) {
//        System.out.println(a + b);
//    }
//}

class Calc {
    public final void show() { // This cannot be Overidded by any other Method
        System.out.println("Done By Rudra");
    }
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc { // I dont want to Someone inherit my class. If I want to block it I can use final keyword to My Calc class.
//    public void show() {
//        System.out.println("Done By Someone Else");
//    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

public class FinalKeyword  {
    public static void main(String[] args) {

        final int num = 10; // Final Variable Cannot be changed.

//        num = 20; // error: cannot assign a value to final variable num
        System.out.println("num = " + num);

        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(10, 30);
    }
}