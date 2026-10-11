import java.util.ArrayList;
import java.util.Scanner;
public class JavaUtilDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many names? ");
            int count = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < count; i++) {
                System.out.print("Name " + (i + 1) + ": ");
                names.add(scanner.nextLine());
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid count.");
            return;
        }
        System.out.println("Names: " + names);
    }
}
