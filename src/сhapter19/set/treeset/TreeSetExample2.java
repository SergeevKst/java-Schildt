package сhapter19.set.treeset;

import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(Student::compare);
        Student student1 = new Student("Konstantin", 2);
        Student student2 = new Student("Marta", 5);
        Student student3 = new Student("Ygin", 2);
        Student student4 = new Student("Heck", 4);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);

        System.out.println(treeSet.last());
        System.out.println(treeSet.first());
        System.out.println(treeSet.headSet(new Student("Heck", 4)));
        System.out.println(treeSet.tailSet(student2));
        System.out.println(treeSet.subSet(student1, student4));

        System.out.println(treeSet);

        System.out.println(student1.equals(student3));
    }
}
