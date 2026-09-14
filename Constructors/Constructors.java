class Human {
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "Rudra";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Human rudra = new Human();
        System.out.println(rudra.getName() + " : " + rudra.getAge());
    }
}