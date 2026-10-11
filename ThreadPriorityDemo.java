public class ThreadPriorityDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 1; i <= 3; i++) System.out.println(Thread.currentThread().getName() + " (priority " + Thread.currentThread().getPriority() + ")");
        };
        Thread low = new Thread(task, "Low");
        Thread normal = new Thread(task, "Normal");
        Thread high = new Thread(task, "High");
        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        low.start(); normal.start(); high.start();
        low.join(); normal.join(); high.join();
        System.out.println("Priority is a scheduling hint; it does not guarantee execution order.");
    }
}
