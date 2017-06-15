public class GreetingTest {
    public static void main(String[] args) {
        Runnable r = new GreetingRunnable("Hello, World!");
        Thread t = new Thread(r);
        t.start();
    }
}