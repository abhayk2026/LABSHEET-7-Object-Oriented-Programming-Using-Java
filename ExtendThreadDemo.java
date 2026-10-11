class MessageThread extends Thread {
    @Override public void run() {
        for (int i = 1; i <= 5; i++) System.out.println(getName() + ": message " + i);
    }
}
public class ExtendThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MessageThread thread = new MessageThread();
        thread.setName("MessageThread");
        thread.start();
        thread.join();
    }
}
