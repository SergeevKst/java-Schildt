package сhapter19.queue.linked;

import java.util.LinkedList;
import java.util.Queue;
//FIFO
public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("Kst");
        queue.add("Maria");
        queue.add("Alex");
        queue.add("Marta");

        //Если коллекция ограниченная. Не позволит добавить
        queue.offer("Martin");
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.element());
    }
}
