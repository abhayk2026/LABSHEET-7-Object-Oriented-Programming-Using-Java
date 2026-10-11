public class RealLifeThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread download = new Thread(() -> {
            for (int percent = 25; percent <= 100; percent += 25) {
                System.out.println("Download task: " + percent + "% complete");
                try { Thread.sleep(150); } catch (InterruptedException e) { Thread.currentThread().interrupt(); return; }
            }
        }, "DownloadTask");
        Thread process = new Thread(() -> {
            for (int item = 1; item <= 4; item++) {
                System.out.println("Processing task: processed item " + item);
                try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); return; }
            }
        }, "ProcessingTask");
        download.start(); process.start();
        download.join(); process.join();
        System.out.println("Both tasks completed. DownloadTask simulates downloading; ProcessingTask simulates data processing.");
    }
}
