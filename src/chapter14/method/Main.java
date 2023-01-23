package chapter14.method;

public class Main {
    public static void main(String[] args) {
        Cell<String> cell = new Cell<>();
        Integer e = cell.getE(100);
    }
}

class Cell<T> {
    T t;

    public void setT(T t) {
        this.t = t;
    }

    public <E> E getE(E e) {
        return e;
    }
}

