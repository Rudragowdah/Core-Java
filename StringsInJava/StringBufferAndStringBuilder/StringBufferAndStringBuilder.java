public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Rudra");
        // this is a Mutable String Creation, Meaning We can change the value of Same String Object here.
        name.append(" Gowda");
        name.insert(6, "Java ");
        name.setLength(30);

        // The only difference Betwenn String Buffer and String Builder is
        // String Buffer is a Thread Safe And
        // String Builder is not a Thread Safe.
        // In Java, thread safety is a property of an object or piece of code that guarantees it will
        // behave correctly and maintain data integrity when accessed by multiple threads simultaneously.
        // Whatever Methods we have in String Buffer is same in String Builder.

        System.out.println(name);
    }
}