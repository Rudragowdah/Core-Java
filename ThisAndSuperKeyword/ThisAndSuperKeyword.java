class A {
    int num = 1;
}

class B extends A {
    int num = 2;

    public int getValue() {
        int num = 3;
//        return num; // This Returns "3", Becuase we are Refering to the Local Variable.
//        return this.num; // This returns "2", because we are Returning the Instance Variable.
        return super.num; // This will return "1", This references the Super Class Variable.
    }
}

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getValue());
    }
}