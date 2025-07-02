import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask for user's age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Validate age
        if (age <= 0) {
            System.out.println("Invalid age entered. Please enter a positive number.");
        } else {
            System.out.println("Hello " + name + ", you are " + age + " years old!");
        }
    }
}
