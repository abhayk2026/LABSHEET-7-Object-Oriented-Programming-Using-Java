import java.util.Scanner;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an index from 0 to 4: ");
            int index = scanner.nextInt();
            try {
                System.out.println("Value: " + values[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index. Valid indexes are 0 through 4.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter an integer index.");
        }
    }
}
