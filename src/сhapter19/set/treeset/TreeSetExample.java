package сhapter19.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet=new TreeSet<>();

        treeSet.add(235);
        treeSet.add(10);
        treeSet.add(45);
        treeSet.add(546);
        treeSet.add(568);
        treeSet.add(780);

        System.out.println(treeSet);
        System.out.println(treeSet.remove(10));
        System.out.println(treeSet.contains(10));
    }
}
