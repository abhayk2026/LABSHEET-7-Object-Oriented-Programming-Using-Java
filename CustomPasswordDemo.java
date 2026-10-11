import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) { super(message); }
}

public class CustomPasswordDemo {
    static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must contain at least 6 characters.");
        }
        System.out.println("Password accepted.");
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter password: ");
            try {
                validatePassword(scanner.nextLine());
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
