
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism  {
    public static void main(String[] args) {
        // In Java, polymorphism means “one thing, many forms.”
        // It allows the same method name or reference type to behave differently
        // depending on the object or parameters involved.

        // Java mainly has two types of polymorphism:

        // Compile-time polymorphism — Method Overloading: Same method name, different parameters.

        // Runtime polymorphism — Method Overriding: A subclass provides its own version of a parent class's method.

        Animal a1 = new Dog(); // This is run time Polymorphism
        Animal a2 = new Cat();

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }
}