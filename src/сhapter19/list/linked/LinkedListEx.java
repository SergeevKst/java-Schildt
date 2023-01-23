package сhapter19.list.linked;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {

        Student student = new Student("Konstantin", 1);
        Student student1 = new Student("Ace", 3);
        Student student2 = new Student("Sabo", 5);
        Student student3 = new Student("Luffy", 4);

        List<Student> studentList = new LinkedList<>();

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList);

        Student student4 = new Student("Zoro", 5);
        Student student5 = new Student("Nami", 4);

        studentList.add(1,student4);
        studentList.add(2,student5);

        System.out.println(studentList);

        studentList.remove(0);

        System.out.println(studentList);

    }
}
