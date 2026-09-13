public class MutableAndImmutableStrings {
    public static void main(String[] args) {
        String name = "Rudra";
        name = name + " Gowda";
        // Here the when name = "Rudra" it will create a Object in heap memory.
        // Now If I reassign it as "Rudra Gowda" then the Original Value cannot be Re wriiten.
        // It will create a new String Object with "Rudra Gowda" and Then replaces the refernce Address in name Refernce Variable.

        String s1 = "rudra";
        String s2 = "rudra";
        System.out.println(s1 == s2); // This Prints "true"
        // This is because the String Objects are Created inside something called "String Constant Pool" inside Heap Memory.
        // Now it will check weather There is any String as "rudra" while Creating s1, it is not available then create it.
        // Now it will check weather There is any String as "rudra" while Creating s2, it is available then use the same.
        // Now s1 and s2 (Reference Variables) are refering to the Same String Object inside "String Constant Pool" inside Heap Memory.
        // Because Strings are Immutable. Meaning they cannot be changed once Written.
        //To solve this Probelm of Immutable in Strings we can use String Buffer and String Builder Classes.

    }
}