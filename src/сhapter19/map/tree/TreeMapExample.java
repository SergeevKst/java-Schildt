package сhapter19.map.tree;

import java.util.Comparator;
import java.util.TreeMap;
/*
В основе black-red tree (двоичное самобалансирующие)
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, StudentMap> treeMap = new TreeMap<>();

        StudentMap student1 = new StudentMap("Kst", 1);
        StudentMap student2 = new StudentMap("Pika", 4);
        StudentMap student3 = new StudentMap("Crokodail", 4);
        StudentMap student4 = new StudentMap("Chooper", 5);
        StudentMap student5 = new StudentMap("Usop", 2);
        StudentMap student6 = new StudentMap("Sog King", 1);
        StudentMap student7 = new StudentMap("Sog King", 1);

        treeMap.put(5.8, student1);
        treeMap.put(9.0, student6);
        treeMap.put(4.9, student2);
        treeMap.put(10.0, student5);
        treeMap.put(3.0, student3);
        treeMap.put(7.2, student4);
        treeMap.put(6.2, student7);

        System.out.println(treeMap);
        System.out.println(treeMap.get(3.0));
        System.out.println(treeMap.remove(9.0));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(9.0));
        System.out.println(treeMap.headMap(7.2));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

        TreeMap<StudentMap, Double> treeMapCompare = new TreeMap<>(Comparator.comparingInt(o -> o.getName().length()));

        treeMapCompare.put(student6, 1.2);
        treeMapCompare.put(student2, 2.9);
        treeMapCompare.put(student1, 0.8);
        treeMapCompare.put(student5, 0.0);
        treeMapCompare.put(student3, 3.0);

        System.out.println(treeMapCompare);

    }
}
