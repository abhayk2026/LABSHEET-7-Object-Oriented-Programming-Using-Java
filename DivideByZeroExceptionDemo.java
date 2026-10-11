import java.util.Scanner;

public class DivideByZeroExceptionDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            try {
                System.out.println("Result: " + (numerator / denominator));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            } finally {
                System.out.println("Division attempt finished.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}
