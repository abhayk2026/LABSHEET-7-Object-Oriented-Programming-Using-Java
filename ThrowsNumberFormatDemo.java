import java.util.Scanner;

public class ThrowsNumberFormatDemo {
    static int readNumber(String text) throws NumberFormatException {
        return Integer.parseInt(text);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a whole number: ");
            try {
                int number = readNumber(scanner.nextLine());
                System.out.println("Number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format.");
            }
        }
    }
}
