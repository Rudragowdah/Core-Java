class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class StaticBlock {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        // Here we are Creating Two Objects for Mobile Class and Every time a Object is Created then the Constructor Will be Called.
        // But a Static Block Will be Called When the Class is Loaded into JVM.
        // So it Just Calls the Static Block Only Once.
        // And The Static Block will be exceuted before the Constructor is called.

        // Here, Even though the Object is not Created, but if you want to load the class in JVM and exceute the Static Block then The Below Code can be Used.
        // The Below Line Can Throw ClassNotFoundException, we have to handle it.

//        Class.forName("Mobile");
    }
}