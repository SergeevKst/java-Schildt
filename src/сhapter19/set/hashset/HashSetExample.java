package сhapter19.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("I");
        set.add("Learn");
        set.add("Java");
        set.add("and");
        set.add("Looking forward to ");
        set.add("when I find job in IT");

        set.remove("I");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("O"));
        System.out.println(set);

        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(10);
        setInt.add(2743);
        setInt.add(4789);
        setInt.add(985);
        setInt.add(45);

        Set<Integer> setInt2 = new HashSet<>();
        setInt2.add(235);
        setInt2.add(10);
        setInt2.add(45);
        setInt2.add(546);
        setInt2.add(568);
        setInt2.add(780);

        Set<Integer> union = new HashSet<>(setInt);
        union.addAll(setInt2);
        System.out.println(union);

        Set<Integer> intersect = new HashSet<>(setInt);
        intersect.retainAll(setInt2);
        System.out.println(intersect);

        Set<Integer> subtract = new HashSet<>(setInt);
        subtract.removeAll(setInt2);
        System.out.println(subtract);
    }
}
