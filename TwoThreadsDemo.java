public class TwoThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) System.out.println(Thread.currentThread().getName() + " prints " + i);
        };
        Thread first = new Thread(task, "Thread-A");
        Thread second = new Thread(task, "Thread-B");
        first.start(); second.start();
        first.join(); second.join();
        System.out.println("Order may vary because the JVM/OS scheduler decides which thread runs next.");
    }
}
