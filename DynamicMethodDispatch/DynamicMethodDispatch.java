class A {
    public void show() {
        System.out.println("in A Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B Show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C Show");
    }
}

class D {

}

public class DynamicMethodDispatch  {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // this will print "in A Show" as expected.

        obj = new B(); // This works Fine Because obj is a Reference Variable of A and B extends A.
        obj.show(); // Now this Prints "in B Show" because the even though the reference Variable is A but Implementation is of B class.

        obj = new C(); // This works Fine Because obj is a Reference Variable of A and C extends A.
        obj.show(); // Now this Prints "in C Show" because the even though the reference Variable is A but Implementation is of C class.

//        obj = new D(); // This will through error Because the obj is a reference variable for A but D does not have any relation with A class.

        // In the Above Code of "obj.show();" we dont know Which show() method will be called in each call while compile time.
        // This will be resolved during Run time.
    }
}