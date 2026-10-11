import java.util.Scanner;

public class ThrowAgeDemo {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age accepted.");
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            try {
                checkAge(scanner.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Age check failed: " + e.getMessage());
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter an integer age.");
        }
    }
}
