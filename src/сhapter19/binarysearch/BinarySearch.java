package сhapter19.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(100);
        list.add(-2);
        list.add(140);
        list.add(40);
        list.add(19);
        list.add(25);
        list.add(1000);
        list.add(700);
        list.add(350);
        list.add(15);
        list.add(7);
        list.add(3);

        Collections.sort(list);

        System.out.println(Collections.binarySearch(list, 100));

        Student2 student = new Student2("Konstantin", 1);
        Student2 student1 = new Student2("Sabo", 5);
        Student2 student2 = new Student2("Ace", 3);
        Student2 student3 = new Student2("Luffy", 3);

        List<Student2> studentList1 = new ArrayList<>();

        studentList1.add(student);
        studentList1.add(student1);
        studentList1.add(student2);
        studentList1.add(student3);

        studentList1.sort(Student2::compareStudent);

        System.out.println(Collections.binarySearch(studentList1, student1, Student2::compareStudent));

    }
}
