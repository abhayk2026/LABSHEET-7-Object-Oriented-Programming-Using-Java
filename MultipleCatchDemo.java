import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first integer: ");
            String first = scanner.nextLine();
            System.out.print("Enter second integer: ");
            String second = scanner.nextLine();
            try {
                int a = Integer.parseInt(first);
                int b = Integer.parseInt(second);
                System.out.println("Result: " + (a / b));
            } catch (NumberFormatException e) {
                System.out.println("Input must contain valid integers.");
            } catch (ArithmeticException e) {
                System.out.println("The second number must not be zero.");
            }
        }
    }
}
