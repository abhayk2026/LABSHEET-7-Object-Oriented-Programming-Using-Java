public class FinallyResourceDemo {
    public static void main(String[] args) {
        System.out.println("File opened"); // Simulates opening a resource.
        try {
            System.out.println("Performing operation...");
            int result = 10 / 0; // Deliberately raises an exception for demonstration.
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred during the operation.");
        } finally {
            System.out.println("Resource closed"); // Always runs after try/catch.
        }
    }
}
