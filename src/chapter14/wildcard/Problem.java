package chapter14.wildcard;

class Problem {
    public static void main(String[] args) {
        //ошибки использования методов
        Cell<?> cell = new Cell<Kia>();

        //только get
        Cell<? extends Kia> cell1 = new Cell<>();
        Kia t = cell1.getT();

        //только set
        Cell<? super Kia> cell2 = new Cell<>();
        cell2.setT(new KiaRio());
    }
}

class Car {
}

class Kia extends Car {
}

class KiaRio extends Kia {
}

class Cell<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}