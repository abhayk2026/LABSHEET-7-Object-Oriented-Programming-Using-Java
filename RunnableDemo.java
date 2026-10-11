class NumberTask implements Runnable {
    @Override public void run() {
        for (int i = 1; i <= 10; i++) System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}
public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new NumberTask(), "NumberTask");
        thread.start();
        thread.join();
    }
}
