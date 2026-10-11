public class RaceConditionDemo {
    private static int counter = 0; // Shared and intentionally not synchronized.
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 0; i < 100_000; i++) counter++; };
        Thread first = new Thread(task); Thread second = new Thread(task);
        first.start(); second.start(); first.join(); second.join();
        System.out.println("Expected counter: 200000");
        System.out.println("Actual counter:   " + counter);
        System.out.println("The result may be smaller because counter++ is not atomic; a race is not guaranteed on every run.");
    }
}
