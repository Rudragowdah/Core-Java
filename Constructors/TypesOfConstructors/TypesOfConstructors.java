class Human {
    private int age;
    private String name;

    public Human() { // this is a Default Constructor
        age = 12;
        name = "Rudra";
    }

    public Human(int age, String name) { // This is a Parameterized Constructor
        this.age = age;
        this.name = name;
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

public class TypesOfConstructors {
    public static void main(String[] args) {
        Human rudra = new Human();
        Human virat = new Human(25, "virat");
        System.out.println(rudra.getName() + " : " + rudra.getAge());
        System.out.println(virat.getName() + " : " + virat.getAge());
    }
}