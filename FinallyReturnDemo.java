public class FinallyReturnDemo {
    static int getValue() {
        try {
            System.out.println("Inside try: preparing to return 42.");
            return 42;
        } finally {
            System.out.println("Inside finally: this prints before the method returns.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Returned value: " + getValue());
        // The finally message appears before the caller prints the returned value.
    }
}
