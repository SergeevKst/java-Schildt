package chapter11.count.problem;

public class Counter {
    private int count = 0;

    public void doCounter() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                count++;
            }
            System.out.println(count + ": The first");
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                count++;
            }
            System.out.println(count + ": The second");
        });

        thread.start();
        thread1.start();
    }
}
