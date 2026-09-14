class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // This Key word Refers to the Current Object.
        // If We dont use this Keyword and Just say (age = age), then it will give Priority to Local Variable.
        // Here the age inside the setAge Function is a Local Variable
        // And the age which is declared inside the class is a Instance Varaible.
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Human rudra = new Human();
        rudra.setAge(25);
        rudra.setName("Rudra Gowda H");
        System.out.println(rudra.getName() + " : " + rudra.getAge());
    }
}