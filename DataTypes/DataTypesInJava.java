public class DataTypesInJava {
    public static void main(String[] args) {
//        What is a Data Type?
//
//        A data type specifies:
//        What type of value a variable can store
//        How much memory is needed
//        What operations can be performed on that value
//
//        Types of Data Types in Java
//
//        Java data types are mainly divided into 2 types:
//
//                Java Data Types
//                       |
//             ┌─────────┴─────────┐
//             |                   |
//        Primitive           Non-Primitive
//        Data Types          Data Types
//
//        1. Primitive Data Types
//
//        Primitive data types are the basic, built-in data types in Java.
//
//        Java has 8 primitive data types:
//
//                | Data Type | Used for            | Example             |
//                | --------- | ------------------- | ------------------- |
//                | `byte`    | Small whole numbers | `byte x = 10;`      |
//                | `short`   | Whole numbers       | `short x = 1000;`   |
//                | `int`     | Whole numbers       | `int x = 50000;`    |
//                | `long`    | Large whole numbers | `long x = 100000L;` |
//                | `float`   | Decimal numbers     | `float x = 10.5f;`  |
//                | `double`  | Decimal numbers     | `double x = 10.5;`  |
//                | `char`    | Single character    | `char x = 'A';`     |
//                | `boolean` | True/false          | `boolean x = true;` |
//
//                | Data Type |                              Size | Range / Values        | Example             |
//                | --------- | --------------------------------: | --------------------- | ------------------- |
//                | `byte`    |               **1 byte (8 bits)** | -128 to 127           | `byte x = 10;`      |
//                | `short`   |             **2 bytes (16 bits)** | -32,768 to 32,767     | `short x = 1000;`   |
//                | `int`     |             **4 bytes (32 bits)** | -2³¹ to 2³¹ - 1       | `int x = 50000;`    |
//                | `long`    |             **8 bytes (64 bits)** | -2⁶³ to 2⁶³ - 1       | `long x = 100000L;` |
//                | `float`   |             **4 bytes (32 bits)** | ~6–7 decimal digits   | `float x = 10.5f;`  |
//                | `double`  |             **8 bytes (64 bits)** | ~15–16 decimal digits | `double x = 10.5;`  |
//                | `char`    |             **2 bytes (16 bits)** | `0` to `65,535`       | `char x = 'A';`     |
//                | `boolean` | **Not precisely defined by Java** | `true` or `false`     | `boolean x = true;` |
//
//        One important point
//
//        You may hear that boolean is 1 byte, but that's not technically guaranteed by the Java language specification.
//        Java only specifies that a boolean has two possible values: true and false.
//
//         Primitive
//            ↓
//        Basic values
//            ↓
//        int, byte, short, long
//        float, double
//        char
//        boolean
//
//
//        Non-Primitive
//            ↓
//        Objects / References
//            ↓
//        String
//        Arrays
//        Classes
//        Interfaces
//        Enums

        int num = 3;
        byte by = 127;
        short sh = 558;
        long l = 9879l;

        float f = 98.982f;
        double d = 7652.4098;

        char c = '3';
        boolean b = true;




    }
}