package chapter11.join;

public class SimpleRunner {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();

        try {
            simpleThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
