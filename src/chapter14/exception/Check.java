package chapter14.exception;

/*
Опасность возникновения Exception
из-за совмещения обобщения и Java before 1.5
Пользуемся обобщениями-используем их
 */
public class Check {
    public static void add(Cell cell) {
        cell.setT("Java before 1.5");
    }

    public static void main(String[] args) {
        Cell<House> cell = new Cell<>();
        add(cell);
        House house = cell.getT();
    }
}

class House {
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
