package chapter09.mystack;

public class Main {
    public static void main(String[] args) {
        Menu.start();
    }

    static class Menu {
        public static void start() {
            MyStack<Integer> myStack = new MyStackImpl<>();
            myStack.push(25);
            myStack.push(11);
            myStack.push(12);
            myStack.push(13);
            myStack.push(14);
            myStack.push(15);
            myStack.push(16);
            myStack.push(17);
            myStack.push(18);
            myStack.push(19);
            myStack.push(100);
            myStack.show();

            System.out.println("Look LIFO: " + myStack.peek());

            System.out.println("Look and remove: " + myStack.pop());

            myStack.show();

            myStack.clean();

            System.out.println("Check clean ");
            myStack.show();
            System.out.println("Good");
        }
    }
}
