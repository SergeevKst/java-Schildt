package сhapter19.binarysearch;

import java.util.Objects;

public class Student2 {
    private final String name;
    private final int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static int compareStudent(Student2 anotherOne, Student2 another) {
        int res = anotherOne.course - another.course;
        if (res == 0) {
            res = anotherOne.name.compareTo(another.name);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
