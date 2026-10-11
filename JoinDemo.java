public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> {
            for (int i = 1; i <= 3; i++) System.out.println("First task " + i);
        }, "First");
        Thread second = new Thread(() -> {
            try { first.join(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); return; }
            System.out.println("Second starts after First has finished.");
        }, "Second");
        first.start(); second.start();
        second.join();
    }
}
