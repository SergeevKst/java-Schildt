package chapter14.bound;

import java.io.Serializable;

/*
Продемонстрировать возможность ограничения,
а так же расширения через интерфейсы
 */
class Bond {
    public static void main(String[] args) {
        Cell<Job> cell = new Cell<>();
        cell.setT(new Job());
        cell.doJob();
    }
}

class Job implements Serializable, Cloneable {
    public void doing() {
        System.out.println("Do it");
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class Cell<T extends Job & Serializable & Cloneable> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void doJob() {
        t.doing();
    }
}
