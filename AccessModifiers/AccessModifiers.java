package AccessModifiers;

import AccessModifiers.Other.A;

class C extends A {
    public void abc() {
        System.out.println(marks);
        System.out.println(rollNo); // Protected can be accessed in sub class.
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        A  a = new A();
        System.out.println(a.marks);
        B b = new B();
//        System.out.println(b.marks); throws error because Private Cannot be accessed outside the class.
        b.show(); // this works fine because the Public Can be Accessed from anywhere.
    }
}

/*

                                           Private                 Protected           Public           Default

    Same Class                              Yes,                     Yes,               Yes,               Yes

    Same Package sub class                  No,                      Yes,               Yes,               Yes

    Same Package Non Sub Class              No,                      Yes,               Yes,               Yes

    Different Package Sub Class             No,                      Yes,               Yes,               No

    Different Package Non Sub Class         No,                      No,                Yes,               No

 */
