class A {
    public void  show1() {
        System.out.println("in A Show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B Show");
    }
}

public class UpcastingAndDowncasting  {
    public static void main(String[] args) {
        A obj = new B(); // This is Upcasting. This is implicit converstion. Similar to A obj = (A) new B();
        obj.show1();

        B obj1 = (B) obj; // This is Downcasting. Here we know that the obj is holding Object B reference.
        obj1.show2();

    }
}