import java.util.Scanner;

public class Main {

    // Main method to start the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask for user's age (new input added)
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Greet the user with name and age
        System.out.println("Hello " + name + ", you are " + age + " years old!");
    }
}
