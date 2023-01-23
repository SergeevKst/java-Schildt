package chapter15.reference.generator;

public class SimpleGen {
    private int number;

    public SimpleGen(int number) {
        this.number = number;
    }

    public SimpleGen() {
    }

    public int getNumber() {
        int temp = number;
        number = number + 1;
        return temp;
    }

    public static int getRandom() {
        return (int) (Math.random() * 10);
    }
}
