package сhapter19.map.hash.map;

import java.util.Objects;

public class StudentMap {
    private final String name;
    private final int course;

    public StudentMap(String name, int course) {
        this.name = name;
        this.course=course;
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
        StudentMap student = (StudentMap) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
