public class ThreadLifeCycleDemo {
    private static final Object LOCK = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            synchronized (LOCK) {
                try { Thread.sleep(150); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        }, "Worker");
        System.out.println("New: " + worker.getState());
        synchronized (LOCK) {
            worker.start();
            Thread.sleep(50);
            System.out.println("Blocked (waiting for LOCK): " + worker.getState());
        }
        Thread.sleep(30);
        System.out.println("Runnable or timed waiting (scheduler-dependent): " + worker.getState());
        worker.join();
        System.out.println("Terminated: " + worker.getState());
        System.out.println("JVM reports RUNNABLE for both ready-to-run and actually-running threads; RUNNING is not a separate Thread.State.");
    }
}
