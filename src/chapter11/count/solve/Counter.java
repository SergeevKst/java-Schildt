package chapter11.count.solve;

import java.util.concurrent.atomic.AtomicInteger;
/*
Ключевое слово volatile решает проблему с кешированием
но проблему с атомарностью операций решают atomic
synchronized захват монитора оюъекта
 */
public class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    private int num = 0;

    private void increment() {
        synchronized (this){
            num++;
        }
    }

    public void doCounter() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                count.incrementAndGet();
            }
            System.out.println(count + ": The first");
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                count.incrementAndGet();
            }
            System.out.println(count + ": The second");
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
            System.out.println(num+": Check synchronized increment the first");
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
              increment();
            }
            System.out.println(num+": Check synchronized  increment the second");
        });

        thread2.start();
        thread3.start();
        thread.start();
        thread1.start();
    }
}

