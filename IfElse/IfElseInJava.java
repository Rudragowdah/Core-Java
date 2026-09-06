public class IfElseInJava {
    public static void main(String[] args) {

        int age = 24;

        // The below is the simple If Statement.
        if (age >= 18) {
            System.out.println("Eligible to Vote.");
        }

        age = 145;

        if (age >= 130) {
            System.out.println("You are already in heaven bro.");
        }

        age = 25;

        // The Below is the If Else Statement.
        if (age >= 18) {
            System.out.println("Eligible to Vote.");
        } else {
            System.out.println("Not Eligible to Vote.");
        }


    }
}