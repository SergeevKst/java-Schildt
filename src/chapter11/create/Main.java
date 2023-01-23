package chapter11.create;

public class Main {
    public static void main(String[] args) {
        Extend thread = new Extend();
        thread.start();

        Thread thread1=new Thread(new Implement());
        thread1.start();
    }
}
