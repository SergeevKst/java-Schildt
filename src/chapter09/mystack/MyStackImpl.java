package chapter09.mystack;

import java.util.Arrays;

public class MyStackImpl<E> implements MyStack<E> {
    private Object[] myStack;
    private int count = 0;

    @Override
    public void push(E e) {
        for (int i = 0; i < myStack.length; i++) {
            if (myStack[i] == null) {
                myStack[i] = e;
                count++;
                break;
            } else {
                Object[] newMyStack = new Object[myStack.length + 1];
                System.arraycopy(myStack, 0, newMyStack, 0, myStack.length);
                myStack = newMyStack;
            }
        }

    }

    @Override
    public E pop() {
        for (int i = 0; i < myStack.length; i++) {
            if (myStack[i] != null && myStack[i + 1] == null) {
                Object value = myStack[i];
                myStack[i] = null;
                count--;
                return (E) value;
            }
        }
        return null;
    }

    @Override
    public E peek() {
        for (int i = 0; i < myStack.length; i++) {
            if (myStack[i] != null && myStack[i + 1] == null) {
                return (E) myStack[i];
            }
        }
        return null;
    }

    @Override
    public void show() {
        for (Object i : myStack) {
            if (i != null) System.out.println(i);
        }
    }

    @Override
    public void clean() {
        Arrays.fill(myStack, null);
    }

    public MyStackImpl() {
        this.myStack = new Object[INITIAL_CAPACITY];
    }

}
