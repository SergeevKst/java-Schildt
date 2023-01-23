package сhapter19.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/*
LIFO and FIFO, разница методов- клаасические выбрасывают исключения
LinkedList былл рассмотрен ранее поэтому его тут нет
 */
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(2);
        deque.addFirst(10);
        deque.addLast(70);
        deque.offerFirst(50);
        deque.offerLast(500);

        System.out.println(deque);
        System.out.println(deque.removeFirst());

        System.out.println(deque);
        System.out.println(deque.removeLast());

        System.out.println(deque);
        System.out.println(deque.pollFirst());

        System.out.println(deque);
        System.out.println(deque.pollLast());

        System.out.println(deque);
    }
}
