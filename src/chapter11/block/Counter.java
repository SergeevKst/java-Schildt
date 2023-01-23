package chapter11.block;

public class Counter {

    private int num = 0;
    private Block block = new Block();

    private void increment() {
        try {
            block.block();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        num++;

        block.unBlock();
    }

    public void doCounter() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
            System.out.println(num + ": The first");
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
            System.out.println(num + ": The second");
        });

        thread.start();
        thread1.start();
    }

    class Block {
        private boolean isBlock = false;

        void block() throws InterruptedException {
            synchronized (this) {
                while (isBlock) {
                    wait();
                }
                isBlock = true;
            }
        }

        void unBlock() {
            synchronized (this) {
                isBlock = false;
                notifyAll();
            }
        }
    }
}

