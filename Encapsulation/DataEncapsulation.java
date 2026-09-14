class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class DataEncapsulation {
    public static void main(String[] args) {
        Human rudra = new Human();
        rudra.setAge(25);
        rudra.setName("Rudra Gowda H");
        System.out.println(rudra.getName() + " : " + rudra.getAge());
    }
}