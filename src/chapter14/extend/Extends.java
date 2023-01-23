package chapter14.extend;
/*
Возможности наследования
 */
public class Extends {

    class Child<E> extends Extends {
    }

    class Child1 extends Child<String> {
    }

    class Child2<E> extends Child<E> {
    }

    class Child3<T, E, Z> extends Child<E> {
    }

}
