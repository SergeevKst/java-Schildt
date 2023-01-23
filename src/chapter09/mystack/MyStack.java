package chapter09.mystack;

public interface MyStack<E> {
    int INITIAL_CAPACITY = 10;

    void push(E e);

    E pop();

    E peek();

    void show();

    default void clean() {
    }
}
