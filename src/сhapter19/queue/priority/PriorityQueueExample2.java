package сhapter19.queue.priority;

import java.util.PriorityQueue;

/*
Учитывать что вывод на экран не сортированный,
а работа с элементами в соответсвии с реализованным Comparator
 */
public class PriorityQueueExample2 {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        Student student1 = new Student("Konstantin", 3);
        Student student2 = new Student("Martin", 5);
        Student student3 = new Student("Kesha", 2);
        Student student4 = new Student("Loli", 1);
        Student student5 = new Student("Greg", 2);
        Student student6 = new Student("Sali", 4);

        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        priorityQueue.add(student5);
        priorityQueue.add(student6);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}