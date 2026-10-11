public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread sleeper = new Thread(() -> {
            System.out.println("Sleeper: going to sleep for 2 seconds.");
            try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            System.out.println("Sleeper: awake.");
        }, "Sleeper");
        sleeper.start();
        for (int i = 1; i <= 4; i++) System.out.println("Main continues: " + i);
        sleeper.join();
        System.out.println("Main finished after sleeper completed.");
    }
}
