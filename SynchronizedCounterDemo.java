class SafeCounter {
    private int counter = 0;
    public synchronized void increment() { counter++; }
    public synchronized int getValue() { return counter; }
}
public class SynchronizedCounterDemo {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter counter = new SafeCounter();
        Runnable task = () -> { for (int i = 0; i < 100_000; i++) counter.increment(); };
        Thread first = new Thread(task); Thread second = new Thread(task);
        first.start(); second.start(); first.join(); second.join();
        System.out.println("Expected counter: 200000");
        System.out.println("Actual counter:   " + counter.getValue());
    }
}
