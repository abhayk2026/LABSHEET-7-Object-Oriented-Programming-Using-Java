public class NestedTryDemo {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int numerator = 100;
        int denominator = 0; // Change to a non-zero value to see division succeed.
        try {
            try {
                System.out.println("Array value: " + values[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: invalid array index.");
            }
            System.out.println("Division result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: cannot divide by zero.");
        }
    }
}
