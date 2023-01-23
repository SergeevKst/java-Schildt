package chapter11.join;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Simple thread name is " + getName());
    }
}
